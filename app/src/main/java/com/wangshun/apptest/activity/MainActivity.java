package com.wangshun.apptest.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wangshun.apptest.R;
import com.wangshun.apptest.recycler.CardView2StaggeredGridActivity;
import com.wangshun.apptest.recycler.RecyclerGridActivity;
import com.wangshun.apptest.recycler.RecyclerLinearActivity;
import com.wangshun.apptest.recycler.RecyclerStaggeredGridActivity;
import com.wangshun.apptest.recycler.RecyclerStaggeredGrid2Activity;
import com.wangshun.apptest.view.commomlistview.CommonListViewActivity;
import com.wangshun.apptest.view.qqlistview.QQListViewActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        switch (view.getId()){
            case R.id.btn_01:
                startActivity(new Intent(MainActivity.this,RecyclerStaggeredGridActivity.class));
                finish();
                break;
            case R.id.btn_02:
                startActivity(new Intent(MainActivity.this,RecyclerLinearActivity.class));
                finish();
                break;
            case R.id.btn_03:
                startActivity(new Intent(MainActivity.this,RecyclerGridActivity.class));
                finish();
                break;
            case R.id.btn_04:
                startActivity(new Intent(MainActivity.this,RecyclerStaggeredGrid2Activity.class));
                finish();
                break;
            case R.id.btn_05:
                startActivity(new Intent(MainActivity.this,CardView2StaggeredGridActivity.class));
                finish();
                break;
            case R.id.btn_06:
                startActivity(new Intent(MainActivity.this,QQListViewActivity.class));
                finish();
                break;
            case R.id.btn_07:
                startActivity(new Intent(MainActivity.this,CommonListViewActivity.class));
                finish();
                break;
        }
    }

}
