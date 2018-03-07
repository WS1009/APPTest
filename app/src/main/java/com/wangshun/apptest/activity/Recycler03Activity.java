package com.wangshun.apptest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wangshun.apptest.R;
import com.wangshun.apptest.adapter.MyAdapter;
import com.wangshun.apptest.decoration.MDGridRvDividerDecoration;

import java.util.ArrayList;

public class Recycler03Activity extends Activity implements View.OnClickListener{

    private RecyclerView mRecyclerView;

    private MyAdapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler03);

        Button add = findViewById(R.id.rv_add_item_btn);
        Button del = findViewById(R.id.rv_del_item_btn);
        add.setOnClickListener(Recycler03Activity.this);
        del.setOnClickListener(Recycler03Activity.this);

        initData();
        initView();
    }

    private void initData() {
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mAdapter = new MyAdapter(getData());

        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Recycler03Activity.this,"click " + position + " item", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(Recycler03Activity.this,"long click " + position + " item", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mLayoutManager = new GridLayoutManager(this, 4, OrientationHelper.VERTICAL, false);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(mLayoutManager);
        //设置间隔样式
        mRecyclerView.addItemDecoration(new MDGridRvDividerDecoration(this));
        // 设置adapter
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        String temp = " item";
        for(int i = 0; i < 200; i++) {
            data.add(i + temp);
        }

        return data;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.rv_add_item_btn) {
            mAdapter.addNewItem();
            // 由于Adapter内部是直接在首个Item位置做增加操作，增加完毕后列表移动到首个Item位置
            mLayoutManager.scrollToPosition(0);
        } else if(id == R.id.rv_del_item_btn){
            mAdapter.deleteItem();
            // 由于Adapter内部是直接在首个Item位置做删除操作，删除完毕后列表移动到首个Item位置
            mLayoutManager.scrollToPosition(0);
        }
    }

}
