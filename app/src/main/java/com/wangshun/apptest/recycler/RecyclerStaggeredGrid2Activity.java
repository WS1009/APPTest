package com.wangshun.apptest.recycler;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.wangshun.apptest.R;
import com.wangshun.apptest.adapter.MDStaggeredRvAdapter;
import com.wangshun.apptest.decoration.MDGridRvDividerDecoration;

import java.util.ArrayList;

public class RecyclerStaggeredGrid2Activity extends Activity {

    private RecyclerView mRecyclerView;

    private MDStaggeredRvAdapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler04);

        mRecyclerView= findViewById(R.id.my_recycler_view);

        mAdapter = new MDStaggeredRvAdapter(getData());
        // 初始化布局管理器
        mLayoutManager = new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL);

        // 设置布局管理器
        mRecyclerView.setLayoutManager(mLayoutManager);
        // 设置adapter
        mRecyclerView.setAdapter(mAdapter);
        // 设置间隔样式
        mRecyclerView.addItemDecoration(new MDGridRvDividerDecoration(this));

    }


    private ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        String temp = " item";
        for (int i = 0; i < 20; i++) {
            data.add(i + temp);
        }
        return data;
    }


}
