package com.wangshun.apptest.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wangshun.apptest.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        switch (view.getId()){
            case R.id.btn_01:
                startActivity(new Intent(MainActivity.this,Recycler01Activity.class));
                finish();
                break;
            case R.id.btn_02:
                startActivity(new Intent(MainActivity.this,Recycler02Activity.class));
                finish();
                break;
            case R.id.btn_03:
                startActivity(new Intent(MainActivity.this,Recycler03Activity.class));
                finish();
                break;
            case R.id.btn_04:
                startActivity(new Intent(MainActivity.this,Recycler04Activity.class));
                finish();
                break;
        }
    }

}
