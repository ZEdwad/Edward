package com.bwei.Test.zhangjian20170829.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bwei.Test.zhangjian20170829.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.lv);
        list=new ArrayList<>();
        for (int i=1;i<11;i++){
            list.add("会越来越好");
        }
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list));
    }
}
