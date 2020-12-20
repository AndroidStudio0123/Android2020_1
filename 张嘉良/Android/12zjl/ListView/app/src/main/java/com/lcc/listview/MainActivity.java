package com.lcc.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import com.lcc.listview.MyBaseAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview1);
        String[] strings = {"1","2","3","4","5"};
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(getApplicationContext(),strings);
        listView.setAdapter(myBaseAdapter);
    }
}