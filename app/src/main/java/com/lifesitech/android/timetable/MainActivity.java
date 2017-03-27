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
    SharedPreferences sharedPreferences = getSharedPreferences("Data", MODE_PRIVATE);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1s = (TextView) findViewById(R.id.m1s);
        edit_subject = (EditText) findViewById(R.id.edit_subject);
    }


    public void dialog_m1(View v) {
        //テキスト入力を受け付けるビューを作成します。
        final EditText editView = new EditText(MainActivity.this);
        new AlertDialog.Builder(MainActivity.this)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle("テキスト入力ダイアログ")
                //setViewにてビューを設定します。
                .setView(editView)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //入力した文字をトースト出力する
                        Toast.makeText(MainActivity.this,
                                editView.getText().toString(),
                                Toast.LENGTH_LONG).show();

                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("subject_m1", editView.getText().toString());

                    }
                })
                .setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                })
                .show();

    }

    public void ok(View v) {

    }



}
