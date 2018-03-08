package com.wangshun.apptest.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wangshun.apptest.R;
import com.wangshun.apptest.recycler.RecyclerGridActivity;
import com.wangshun.apptest.recycler.RecyclerLinearActivity;
import com.wangshun.apptest.recycler.RecyclerStaggerGridActivity;
import com.wangshun.apptest.recycler.RecyclerStaggeredGrid2Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        switch (view.getId()){
            case R.id.btn_01:
                startActivity(new Intent(MainActivity.this,RecyclerStaggerGridActivity.class));
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
        }
    }

}
