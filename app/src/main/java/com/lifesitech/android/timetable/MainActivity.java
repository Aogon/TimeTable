package com.lifesitech.android.timetable;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class MainActivity extends AppCompatActivity {
    TextView m1s;
    EditText edit_subject;
    Map<String, String> map = new HashMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1s = (TextView) findViewById(R.id.m1s);
        edit_subject = (EditText) findViewById(R.id.edit_subject);
    }


    public void dialog_m1(View v) {
        //テキスト入力を受け付けるビューを作成します。
        CustomDialogFragment customDialogFragment = new CustomDialogFragment();
        customDialogFragment.show(getFragmentManager(), "test");
    }

    public void ok(View v) {

    }



}
