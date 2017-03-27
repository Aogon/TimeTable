package com.lifesitech.android.timetable;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class MainActivity extends AppCompatActivity {
    TextView m1s;
    TextView m1t;
    Map<String, String> map = new HashMap<>();
    Dialog mDialog;
    EditText edit_subject;
    EditText edit_teacher;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1s = (TextView) findViewById(R.id.m1s);
        m1t = (TextView) findViewById(R.id.m1t);

        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
        m1s.setText(sharedPreferences.getString("subject_m1", ""));
        m1t.setText(sharedPreferences.getString("teacher_m1", ""));
    }


    public void dialog_m1(View v) {
        //テキスト入力を受け付けるビューを作成します。


        mDialog = new Dialog(MainActivity.this);

        mDialog.setContentView(R.layout.dialog_custom);
        mDialog.setTitle("Dialogのタイトル");
        mDialog.findViewById(R.id.ok).setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        //OKを押したときの処理
                        edit_subject = (EditText) mDialog.findViewById(R.id.edit_subject);
                        edit_teacher = (EditText) mDialog.findViewById(R.id.edit_teacher);
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("subject_m1", edit_subject.getText().toString());
                        editor.putString("teacher_m1", edit_teacher.getText().toString());
                        editor.apply();
                        m1s.setText(edit_subject.getText().toString());
                        m1t.setText(edit_teacher.getText().toString());
                        mDialog.dismiss();
                    }
                }
        );
        mDialog.show();
    }

    public void ok(View v) {

    }



}
