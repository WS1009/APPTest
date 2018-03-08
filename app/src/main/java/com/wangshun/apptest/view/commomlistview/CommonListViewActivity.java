package com.wangshun.apptest.view.commomlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.wangshun.apptest.R;

import java.util.ArrayList;
import java.util.List;

public class CommonListViewActivity extends Activity {

    private ListView mListView;
    private List<Bean> mDatas = new ArrayList<Bean>();


    private CommonAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_listview);
        mListView = (ListView) findViewById(R.id.id_lv_main);


        Bean b1 = new Bean("title1", "d2", "p1", "t1");
        Bean b2 = new Bean("title2", "d2", "p1", "t1");
        Bean b3 = new Bean("title3", "d2", "p1", "t1");
        Bean b4 = new Bean("title4", "d2", "p1", "t1");
        Bean b5 = new Bean("title5", "d2", "p1", "t1");
        Bean b6 = new Bean("title6", "d2", "p1", "t1");
        Bean b7 = new Bean("title7", "d2", "p1", "t1");

        mDatas.add(b1);
        mDatas.add(b2);
        mDatas.add(b3);
        mDatas.add(b4);
        mDatas.add(b5);
        mDatas.add(b6);
        mDatas.add(b7);


        //设置适配器
        mListView.setAdapter(mAdapter = new CommonAdapter<Bean>(
                getApplicationContext(), mDatas, R.layout.item_single_str2) {
            @Override
            public void convert(ViewHolder viewHolder, Bean item) {
                viewHolder.setText(R.id.tv_title, item.getTitle());
                viewHolder.setText(R.id.tv_describe, item.getDesc());
                viewHolder.setText(R.id.tv_phone, item.getPhone());
                viewHolder.setText(R.id.tv_time, item.getTime());
            }

        });


    }
}
