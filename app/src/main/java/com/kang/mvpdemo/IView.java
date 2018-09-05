package com.kang.mvpdemo;

import android.content.Context;

/**
 * @author created by Administrator on 2018/9/5 0005 11:47
 */
public interface IView {
    public Context getContext();

    public void showProgress(boolean isShow);

    public void clearText();

    public void loginResult(boolean isSuccessful);
}
