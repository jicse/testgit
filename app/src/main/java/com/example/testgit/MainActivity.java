package com.example.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test","test");
// example code
        Log.d("test1","test1");
        Log.d("test1","test1");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
