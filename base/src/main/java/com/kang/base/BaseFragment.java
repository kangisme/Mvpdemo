package com.kang.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.logger.Logger;

/**
 * @author created by Administrator on 2018/9/12 0012 12:00
 */
public class BaseFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logger.d("F onAttach");
    }

    @Override
    public void onStart() {
        super.onStart();
        Logger.d("F onStart");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("F onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Logger.d("F onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logger.d("F onActivityCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        Logger.d("F onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Logger.d("F onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Logger.d("F onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logger.d("F onDestroy");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.d("F onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Logger.d("F onDetach");
    }
}
