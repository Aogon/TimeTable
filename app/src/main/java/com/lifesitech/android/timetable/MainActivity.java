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

    TextView m1s; TextView m1t; TextView m2s; TextView m2t; TextView m3s; TextView m3t; TextView m4s; TextView m4t; TextView m5s; TextView m5t; TextView m6s; TextView m6t; TextView m7s; TextView m7t;
    TextView tu1s; TextView tu1t; TextView tu2s; TextView tu2t; TextView tu3s; TextView tu3t; TextView tu4s; TextView tu4t; TextView tu5s; TextView tu5t; TextView tu6s; TextView tu6t; TextView tu7s; TextView tu7t;
    TextView w1s; TextView w1t; TextView w2s; TextView w2t; TextView w3s; TextView w3t; TextView w4s; TextView w4t; TextView w5s; TextView w5t; TextView w6s; TextView w6t; TextView w7s; TextView w7t;
    TextView th1s; TextView th1t; TextView th2s; TextView th2t; TextView th3s; TextView th3t; TextView th4s; TextView th4t; TextView th5s; TextView th5t; TextView th6s; TextView th6t; TextView th7s; TextView th7t;
    TextView f1s; TextView f1t; TextView f2s; TextView f2t; TextView f3s; TextView f3t; TextView f4s; TextView f4t; TextView f5s; TextView f5t; TextView f6s; TextView f6t; TextView f7s; TextView f7t;
    TextView sa1s; TextView sa1t; TextView sa2s; TextView sa2t; TextView sa3s; TextView sa3t; TextView sa4s; TextView sa4t; TextView sa5s; TextView sa5t; TextView sa6s; TextView sa6t; TextView sa7s; TextView sa7t;
    Dialog mDialog;
    EditText edit_subject;
    EditText edit_teacher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1s = (TextView) findViewById(R.id.m1s);
        m1t = (TextView) findViewById(R.id.m1t);
        m2s = (TextView) findViewById(R.id.m2s);
        m2t = (TextView) findViewById(R.id.m2t);
        m3s = (TextView) findViewById(R.id.m3s);
        m3t = (TextView) findViewById(R.id.m3t);
        m4s = (TextView) findViewById(R.id.m4s);
        m4t = (TextView) findViewById(R.id.m4t);
        m5s = (TextView) findViewById(R.id.m5s);
        m5t = (TextView) findViewById(R.id.m5t);
        m6s = (TextView) findViewById(R.id.m6s);
        m6t = (TextView) findViewById(R.id.m6t);
        m7s = (TextView) findViewById(R.id.m7s);
        m7t = (TextView) findViewById(R.id.m7t);

        tu1s = (TextView) findViewById(R.id.tu1s);
        tu1t = (TextView) findViewById(R.id.tu1t);
        tu2s = (TextView) findViewById(R.id.tu2s);
        tu2t = (TextView) findViewById(R.id.tu2t);
        tu3s = (TextView) findViewById(R.id.tu3s);
        tu3t = (TextView) findViewById(R.id.tu3t);
        tu4s = (TextView) findViewById(R.id.tu4s);
        tu4t = (TextView) findViewById(R.id.tu4t);
        tu5s = (TextView) findViewById(R.id.tu5s);
        tu5t = (TextView) findViewById(R.id.tu5t);
        tu6s = (TextView) findViewById(R.id.tu6s);
        tu6t = (TextView) findViewById(R.id.tu6t);
        tu7s = (TextView) findViewById(R.id.tu7s);
        tu7t = (TextView) findViewById(R.id.tu7t);

        w1s = (TextView) findViewById(R.id.w1s);
        w1t = (TextView) findViewById(R.id.w1t);
        w2s = (TextView) findViewById(R.id.w2s);
        w2t = (TextView) findViewById(R.id.w2t);
        w3s = (TextView) findViewById(R.id.w3s);
        w3t = (TextView) findViewById(R.id.w3t);
        w4s = (TextView) findViewById(R.id.w4s);
        w4t = (TextView) findViewById(R.id.w4t);
        w5s = (TextView) findViewById(R.id.w5s);
        w5t = (TextView) findViewById(R.id.w5t);
        w6s = (TextView) findViewById(R.id.w6s);
        w6t = (TextView) findViewById(R.id.w6t);
        w7s = (TextView) findViewById(R.id.w7s);
        w7t = (TextView) findViewById(R.id.w7t);

        th1s = (TextView) findViewById(R.id.th1s);
        th1t = (TextView) findViewById(R.id.th1t);
        th2s = (TextView) findViewById(R.id.th2s);
        th2t = (TextView) findViewById(R.id.th2t);
        th3s = (TextView) findViewById(R.id.th3s);
        th3t = (TextView) findViewById(R.id.th3t);
        th4s = (TextView) findViewById(R.id.th4s);
        th4t = (TextView) findViewById(R.id.th4t);
        th5s = (TextView) findViewById(R.id.th5s);
        th5t = (TextView) findViewById(R.id.th5t);
        th6s = (TextView) findViewById(R.id.th6s);
        th6t = (TextView) findViewById(R.id.th6t);
        th7s = (TextView) findViewById(R.id.th7s);
        th7t = (TextView) findViewById(R.id.th7t);

        f1s = (TextView) findViewById(R.id.f1s);
        f1t = (TextView) findViewById(R.id.f1t);
        f2s = (TextView) findViewById(R.id.f2s);
        f2t = (TextView) findViewById(R.id.f2t);
        f3s = (TextView) findViewById(R.id.f3s);
        f3t = (TextView) findViewById(R.id.f3t);
        f4s = (TextView) findViewById(R.id.f4s);
        f4t = (TextView) findViewById(R.id.f4t);
        f5s = (TextView) findViewById(R.id.f5s);
        f5t = (TextView) findViewById(R.id.f5t);
        f6s = (TextView) findViewById(R.id.f6s);
        f6t = (TextView) findViewById(R.id.f6t);
        f7s = (TextView) findViewById(R.id.f7s);
        f7t = (TextView) findViewById(R.id.f7t);

        sa1s = (TextView) findViewById(R.id.sa1s);
        sa1t = (TextView) findViewById(R.id.sa1t);
        sa2s = (TextView) findViewById(R.id.sa2s);
        sa2t = (TextView) findViewById(R.id.sa2t);
        sa3s = (TextView) findViewById(R.id.sa3s);
        sa3t = (TextView) findViewById(R.id.sa3t);
        sa4s = (TextView) findViewById(R.id.sa4s);
        sa4t = (TextView) findViewById(R.id.sa4t);
        sa5s = (TextView) findViewById(R.id.sa5s);
        sa5t = (TextView) findViewById(R.id.sa5t);
        sa6s = (TextView) findViewById(R.id.sa6s);
        sa6t = (TextView) findViewById(R.id.sa6t);
        sa7s = (TextView) findViewById(R.id.sa7s);
        sa7t = (TextView) findViewById(R.id.sa7t);


        init("m1", m1s, m1t);
        init("m2", m2s, m2t);
        init("m3", m3s, m3t);
        init("m4", m4s, m4t);
        init("m5", m5s, m5t);
        init("m6", m6s, m6t);
        init("m7", m7s, m7t);

        init("tu1", tu1s, tu1t);
        init("tu2", tu2s, tu2t);
        init("tu3", tu3s, tu3t);
        init("tu4", tu4s, tu4t);
        init("tu5", tu5s, tu5t);
        init("tu6", tu6s, tu6t);
        init("tu7", tu7s, tu7t);

        init("w1", w1s, w1t);
        init("w2", w2s, w2t);
        init("w3", w3s, w3t);
        init("w4", w4s, w4t);
        init("w5", w5s, w5t);
        init("w6", w6s, w6t);
        init("w7", w7s, w7t);

        init("th1", th1s, th1t);
        init("th2", th2s, th2t);
        init("th3", th3s, th3t);
        init("th4", th4s, th4t);
        init("th5", th5s, th5t);
        init("th6", th6s, th6t);
        init("th7", th7s, th7t);

        init("f1", f1s, f1t);
        init("f2", f2s, f2t);
        init("f3", f3s, f3t);
        init("f4", f4s, f4t);
        init("f5", f5s, f5t);
        init("f6", f6s, f6t);
        init("f7", f7s, f7t);

        init("sa1", sa1s, sa1t);
        init("sa2", sa1s, sa2t);
        init("sa3", sa1s, sa3t);
        init("sa4", sa1s, sa4t);
        init("sa5", sa1s, sa5t);
        init("sa6", sa1s, sa6t);
        init("sa7", sa1s, sa7t);






    }


    public void dialog_m1(View v) {
        makeDialog("m1", m1s, m1t);
    }

    public void dialog_m2(View v) {
        makeDialog("m2", m2s, m2t);
    }

    public void dialog_m3(View v) {
        makeDialog("m3", m3s, m3t);
    }

    public void dialog_m4(View v) {
        makeDialog("m2", m4s, m4t);
    }

    public void dialog_m5(View v) {
        makeDialog("m1", m5s, m5t);
    }

    public void dialog_m6(View v) {
        makeDialog("m6", m6s, m6t);
    }

    public void dialog_m7(View v) {
        makeDialog("m7", m7s, m7t);
    }

    public void dialog_tu1(View v) {
        makeDialog("tu1", tu1s, tu1t);
    }

    public void dialog_tu2(View v) {
        makeDialog("tu2", tu2s, tu2t);
    }

    public void dialog_tu3(View v) {
        makeDialog("tu3", tu3s, tu3t);
    }

    public void dialog_tu4(View v) {
        makeDialog("tu4", tu4s, tu4t);
    }

    public void dialog_tu5(View v) {
        makeDialog("tu5", tu5s, tu5t);
    }

    public void dialog_tu6(View v) {
        makeDialog("tu6", tu6s, tu6t);
    }

    public void dialog_tu7(View v) {
        makeDialog("tu7", tu7s, tu7t);
    }

    








    public void setColorButton(final String key, TextView textView1, TextView textView2){
        setColor(R.id.color1, R.color.color1, key, textView1, textView2);
        setColor(R.id.color2, R.color.color2, key, textView1, textView2);
        setColor(R.id.color3, R.color.color3, key, textView1, textView2);
        setColor(R.id.color4, R.color.color4, key, textView1, textView2);
        setColor(R.id.color5, R.color.color5, key, textView1, textView2);
        setColor(R.id.color6, R.color.color6, key, textView1, textView2);
        setColor(R.id.color7, R.color.color7, key, textView1, textView2);
        setColor(R.id.color8, R.color.color8, key, textView1, textView2);
        setColor(R.id.color9, R.color.color9, key, textView1, textView2);
        setColor(R.id.color10, R.color.color10, key, textView1, textView2);
        setColor(R.id.color11, R.color.color11, key, textView1, textView2);
        setColor(R.id.color12, R.color.color12, key, textView1, textView2);
        setColor(R.id.color13, R.color.color13, key, textView1, textView2);
        setColor(R.id.color14, R.color.color14, key, textView1, textView2);
        setColor(R.id.color15, R.color.color15, key, textView1, textView2);
        setColor(R.id.color16, R.color.color16, key, textView1, textView2);
        setColor(R.id.color17, R.color.color17, key, textView1, textView2);
        setColor(R.id.color18, R.color.color18, key, textView1, textView2);
        setColor(R.id.color19, R.color.color19, key, textView1, textView2);
        setColor(R.id.color20, R.color.color20, key, textView1, textView2);

    }

    public void setColor(final int id, final int colorId, final String key, final TextView textView1, final TextView textView2) {
        mDialog.findViewById(id).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("color_" + key, colorId);
                        editor.apply();
                        textView1.setBackgroundColor(getResources().getColor(colorId));
                        textView2.setBackgroundColor(getResources().getColor(colorId));
                        Log.d("Color", String.valueOf(colorId));
                        Log.d("String", key);
                        Log.d("pref", String.valueOf(sharedPreferences.getInt("color_m1", 0)));
                    }
                }
        );
    }

    public void makeDialog(final String key, final TextView textView1, final TextView textView2) {
        mDialog = new Dialog(MainActivity.this);
        mDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        mDialog.setContentView(R.layout.dialog_custom);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setColorButton(key, textView1, textView2);

        mDialog.findViewById(R.id.ok).setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        //OKを押したときの処理
                        edit_subject = (EditText) mDialog.findViewById(R.id.edit_subject);
                        edit_teacher = (EditText) mDialog.findViewById(R.id.edit_teacher);
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("subject_" + key, edit_subject.getText().toString());
                        editor.putString("teacher_" + key, edit_teacher.getText().toString());
                        editor.apply();
                        textView1.setText(edit_subject.getText().toString());
                        textView2.setText(edit_teacher.getText().toString());
                        mDialog.dismiss();
                    }
                }
        );
        mDialog.show();
    }

    public void  init(final String key, TextView textView1, TextView textView2) {
        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
        textView1.setText(sharedPreferences.getString("subject_" + key, ""));
        textView2.setText(sharedPreferences.getString("teacher_" + key, ""));
        textView1.setBackgroundColor(getResources().getColor(sharedPreferences.getInt("color_" + key, R.color.white)));
        textView2.setBackgroundColor(getResources().getColor(sharedPreferences.getInt("color_" + key, R.color.white)));

    }
}




