package com.wangshun.apptest.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.wangshun.apptest.R;
import com.wangshun.apptest.recycler.CardView2StaggeredGridActivity;
import com.wangshun.apptest.recycler.RecyclerGridActivity;
import com.wangshun.apptest.recycler.RecyclerLinearActivity;
import com.wangshun.apptest.recycler.RecyclerStaggeredGridActivity;
import com.wangshun.apptest.recycler.RecyclerStaggeredGrid2Activity;
import com.wangshun.apptest.view.commomlistview.CommonAdapter;
import com.wangshun.apptest.view.commomlistview.CommonListViewActivity;
import com.wangshun.apptest.view.commomlistview.ViewHolder;
import com.wangshun.apptest.view.qqlistview.QQListViewActivity;
import com.wangshun.apptest.view.zdy.CustomTitleActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<String>();
        list.add("RecyclerStaggeredGridActivity");
        list.add("RecyclerLinearActivity");
        list.add("RecyclerGridActivity");
        list.add("RecyclerStaggeredGrid2Activity");
        list.add("CardView2StaggeredGridActivity");
        list.add("QQListViewActivity");
        list.add("CommonListViewActivity");
        list.add("CustomTitleActivity");


        mListView = findViewById(R.id.lv_main);

        mListView.setAdapter(new CommonAdapter<String>(this, list, R.layout.main_list) {
            @Override
            public void convert(ViewHolder helper, String item) {
                helper.setText(R.id.tv, item);
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(MainActivity.this,RecyclerStaggeredGridActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,RecyclerLinearActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,RecyclerGridActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,RecyclerStaggeredGrid2Activity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,CardView2StaggeredGridActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this,QQListViewActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this,CommonListViewActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this,CustomTitleActivity.class));
                        break;

                }
            }
        });
    }
}

