package com.lifesitech.android.timetable;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    LinearLayout [][] classes;
    Dialog mDialog;
    EditText edit_subject;
    EditText edit_teacher;
    int BUTTON_STATE = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        classes[曜日][時間]
        classes = new LinearLayout[6][7];
        int[][] linearLayoutIds = {{R.id.m1, R.id.m2, R.id.m3, R.id.m4, R.id.m5, R.id.m6, R.id.m7},
                {R.id.tu1, R.id.tu2, R.id.tu3, R.id.tu4, R.id.tu5, R.id.tu6, R.id.tu7},
                {R.id.w1, R.id.w2, R.id.w3, R.id.w4, R.id.w5, R.id.w6, R.id.w7},
                {R.id.th1, R.id.th2, R.id.th3, R.id.th4, R.id.th5, R.id.th6, R.id.th7},
                {R.id.f1, R.id.f2, R.id.f3, R.id.f4, R.id.f5, R.id.f6, R.id.f7},
                {R.id.sa1, R.id.sa2, R.id.sa3, R.id.sa4, R.id.sa5, R.id.sa6, R.id.sa7}};
        for (int i = 0; i < linearLayoutIds.length; i++) {
            for (int j = 0; j < linearLayoutIds[i].length; j++) {
                classes[i][j] = (LinearLayout) findViewById(linearLayoutIds[i][j]);
                init(String.valueOf(classes[i][j].getId()), (TextView)classes[i][j].getChildAt(0), (TextView)classes[i][j].getChildAt(1));
                classes[i][j].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        BUTTON_STATE = 1;
                        SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("selected", v.getId());
                        editor.apply();
                        return true;
                    }
                });
            }
        }


    }



    public void dialog(View v) {
        if (BUTTON_STATE == 0) {
            LinearLayout parent = (LinearLayout)v;
            makeDialog(String.valueOf(parent.getId()), (TextView)parent.getChildAt(0), (TextView)parent.getChildAt(1));
        } else if (BUTTON_STATE == 1) {
            SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            int selectedViewId = sharedPreferences.getInt("selected", -1);
            LinearLayout parent = (LinearLayout)v;
            TextView textView1 = (TextView) parent.getChildAt(0);
            TextView textView2 = (TextView) parent.getChildAt(1);
            String subject = sharedPreferences.getString("subject_" + String.valueOf(selectedViewId), "");
            String teacher = sharedPreferences.getString("teacher_" + String.valueOf(selectedViewId), "");
            int colorId = sharedPreferences.getInt("color_" + String.valueOf(selectedViewId), R.color.white);
            textView1.setBackgroundColor(getResources().getColor(colorId));
            textView2.setBackgroundColor(getResources().getColor(colorId));
            textView1.setText(subject);
            textView2.setText(teacher);
            editor.putString("subject_" + String.valueOf(parent.getId()), subject);
            editor.putString("teacher_" + String.valueOf(parent.getId()), teacher);
            editor.putInt("color_" + String.valueOf(parent.getId()), colorId);
            editor.remove("selected");
            editor.apply();
            BUTTON_STATE = 0;
        } else if (BUTTON_STATE == 2) {
            SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            LinearLayout parent = (LinearLayout)v;
            TextView textView1 = (TextView) parent.getChildAt(0);
            TextView textView2 = (TextView) parent.getChildAt(1);
            editor.remove("subject_" + String.valueOf(parent.getId()));
            editor.remove("teacher_" + String.valueOf(parent.getId()));
            editor.remove("color_" + String.valueOf(parent.getId()));
            editor.apply();
            init(String.valueOf(parent.getId()), textView1, textView2);
            BUTTON_STATE = 0;
        }

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_share:

            case R.id.menu_delete:
                BUTTON_STATE = 2;

        }
        return true;
    }


}






