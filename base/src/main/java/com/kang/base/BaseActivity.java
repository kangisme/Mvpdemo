package com.kang.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

/**
 * @author created by Administrator on 2018/9/11 0011 17:08
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("A onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.d("A onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("A onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("A onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("A onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("A onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("A onDestroy");
    }

}
