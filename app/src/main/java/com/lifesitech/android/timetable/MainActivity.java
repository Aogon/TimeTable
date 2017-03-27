package com.lifesitech.android.timetable;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
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
        m1s.setBackgroundColor(getResources().getColor(sharedPreferences.getInt("color_m1", Color.WHITE)));
        m1t.setBackgroundColor(getResources().getColor(sharedPreferences.getInt("color_m1", Color.WHITE)));
    }


    public void dialog_m1(View v) {
        //テキスト入力を受け付けるビューを作成します。


        mDialog = new Dialog(MainActivity.this);
        mDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);

        mDialog.setContentView(R.layout.dialog_custom);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mDialog.findViewById(R.id.color1).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color1);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color1));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color1));
                    }
                }
        );

        mDialog.findViewById(R.id.color2).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color2);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color2));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color2));
                    }
                }
        );

        mDialog.findViewById(R.id.color3).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color3);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color3));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color3));
                    }
                }
        );

        mDialog.findViewById(R.id.color4).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color4);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color4));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color4));
                    }
                }
        );

        mDialog.findViewById(R.id.color5).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color5);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color5));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color5));
                    }
                }
        );

        mDialog.findViewById(R.id.color6).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color6);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color6));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color6));
                    }
                }
        );

        mDialog.findViewById(R.id.color7).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color7);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color7));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color7));
                    }
                }
        );

        mDialog.findViewById(R.id.color8).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color8);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color8));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color8));
                    }
                }
        );

        mDialog.findViewById(R.id.color9).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color9);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color9));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color9));
                    }
                }
        );

        mDialog.findViewById(R.id.color10).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color10);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color10));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color10));
                    }
                }
        );

        mDialog.findViewById(R.id.color11).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color11);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color11));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color11));
                    }
                }
        );

        mDialog.findViewById(R.id.color12).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color12);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color12));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color12));
                    }
                }
        );

        mDialog.findViewById(R.id.color13).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color13);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color13));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color13));
                    }
                }
        );

        mDialog.findViewById(R.id.color14).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color14);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color14));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color14));
                    }
                }
        );

        mDialog.findViewById(R.id.color15).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color15);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color15));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color15));
                    }
                }
        );

        mDialog.findViewById(R.id.color16).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color16);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color16));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color16));
                    }
                }
        );

        mDialog.findViewById(R.id.color17).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color17);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color17));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color17));
                    }
                }
        );

        mDialog.findViewById(R.id.color18).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color18);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color18));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color18));
                    }
                }
        );

        mDialog.findViewById(R.id.color19).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color19);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color19));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color19));
                    }
                }
        );

        mDialog.findViewById(R.id.color20).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_m1", R.color.color20);
                        editor.apply();
                        m1s.setBackgroundColor(getResources().getColor(R.color.color20));
                        m1t.setBackgroundColor(getResources().getColor(R.color.color20));
                    }
                }
        );

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
