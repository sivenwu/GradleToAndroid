package com.yuan.agradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("yuan","\n\n/////////////////////AGradle Log///////////////////////////////////");

        Log.i("yuan","buildConfigField get value : " + getResources().getString(R.string.test_value));

        Log.i("yuan","resVaule get value : " + getResources().getString(R.string.test_value));

        Log.i("yuan","///////////////////////////////////////////////////////////////////\n\n");

    }
}
