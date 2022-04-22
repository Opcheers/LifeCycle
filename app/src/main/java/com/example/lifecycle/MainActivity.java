package com.example.lifecycle;

import androidx.annotation.LongDef;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button mStartNormalBtn;
    private Button mStartDialogBtn;

    /**
     * 完成各种初始化操作，活动第一次创建时调用
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("data");
            Log.d(TAG, "onCreate: savedInstanceState: tempData --> " + tempData);
        }

        initView();
        initEvent();
    }

    /**
     * 临时保存数据
     * @param outState
     */
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String tempData = "some infomation";
        outState.putString("data", tempData);

    }

    private void initView() {
        mStartNormalBtn = this.findViewById(R.id.start_normal_activity);
        mStartDialogBtn = this.findViewById(R.id.start_dialog_activity);
    }

    private void initEvent() {
        mStartNormalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        mStartDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogAcitivty.class);
                startActivity(intent);
            }
        });
    }


    /**
     * 活动由不可见变为可见时调用
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }


    /**
     * 在活动准备好和用户交互时调用，此时活动位于栈顶且正在运行
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * 在系统准备去启动或恢复另一个活动时调用，此时活动位于栈顶并且正在运行，活动是可以和用户进行交互的
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * 活动完全不可见时调用
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * 在活动被销毁之前调用，调用后活动被销毁
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * 在活动由停止状态变为运行状态之前调用，即，活动被重新启动
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}