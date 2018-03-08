package com.wangshun.apptest.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.wangshun.apptest.R;
import com.wangshun.apptest.view.QQListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QQListViewActivity extends Activity {

    private QQListView mListView;
    private ArrayAdapter<String> mAdapter;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq_listview);
        mListView = (QQListView) findViewById(R.id.id_listview);
        // 不要直接Arrays.asList
        mDatas = new ArrayList<String>(Arrays.asList("HelloWorld", "Welcome", "Java", "Android", "Servlet", "Struts",
                "Hibernate", "Spring", "HTML5", "Javascript", "Lucene"));
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas);
        mListView.setAdapter(mAdapter);

        mListView.setDelButtonClickListener(new QQListView.DelButtonClickListener() {
            @Override
            public void clickHappend(final int position) {
                Toast.makeText(QQListViewActivity.this, position + " : " + mAdapter.getItem(position), 1).show();
                mAdapter.remove(mAdapter.getItem(position));
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(QQListViewActivity.this, position + " : " + mAdapter.getItem(position), 1).show();
            }
        });
    }
}
