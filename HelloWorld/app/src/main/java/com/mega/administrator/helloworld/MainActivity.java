package com.mega.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("liangfei","onResume");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("liangfei","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}
