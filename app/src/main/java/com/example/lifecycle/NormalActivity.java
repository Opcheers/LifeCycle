package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {

    private static final String TAG = "NormalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Log.d(TAG, "onCreate...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy...");
    }
}