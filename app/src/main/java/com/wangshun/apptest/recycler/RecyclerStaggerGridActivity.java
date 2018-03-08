package com.wangshun.apptest.recycler;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.wangshun.apptest.R;
import com.wangshun.apptest.decoration.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class RecyclerStaggerGridActivity extends Activity {

    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private HomeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler01);

        initData();

        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        mAdapter = new HomeAdapter();

        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerView.setLayoutManager(new GridLayoutManager(this,4));

        //设置布局管理器 StaggeredGridLayout以瀑布流方式展示item
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,
                StaggeredGridLayoutManager.VERTICAL));

        mRecyclerView.setAdapter(mAdapter);

        //item的间隔
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(this));

        // 设置Item添加和移除的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    protected void initData() {
        mDatas = new ArrayList<String>();

        String temp = " item";
        for (int i = 0; i < 200; i++) {
            mDatas.add(i + temp);
        }

    }

    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // 实例化展示的view
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
            // 实例化viewholder
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            // 绑定数据
            holder.tv.setText(mDatas.get(position));

        }

        @Override
        public int getItemCount() {
            return mDatas == null ? 0 : mDatas.size();
        }


        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView tv;

            public MyViewHolder(View view) {
                super(view);
                tv = (TextView) view.findViewById(R.id.id_num);
            }
        }
    }

}
