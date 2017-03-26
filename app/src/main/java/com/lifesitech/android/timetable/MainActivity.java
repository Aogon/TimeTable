package com.lifesitech.android.timetable;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();

        list.add("月");
        list.add("火");
        list.add("水");
        list.add("木");
        list.add("金");
        list.add("土");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1, list);

        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(adapter);
        gridView.setBackgroundColor(Color.parseColor("#ff1493"));

    }
}
