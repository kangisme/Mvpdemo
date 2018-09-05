package com.kang.mvpdemo;


import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * @author created by Administrator on 2018/9/5 0005 11:47
 */
public class LoginPresenter implements IPresenter {

    private static final int MSG_LOGIN_SUCCESS = 0;

    private static final int MSG_LOGIN_FAIL = 1;

    IView mView;

    Model mModel;

    Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_LOGIN_SUCCESS:
                    mView.showProgress(false);
                    mView.loginResult(true);
                    break;
                case MSG_LOGIN_FAIL:
                    break;
            }
            return false;
        }
    });

    public LoginPresenter(IView view) {
        this.mView = view;
        mModel = new Model();
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(mView.getContext(), "username or password is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        mView.showProgress(true);
        //Login ...
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mHandler.sendEmptyMessage(MSG_LOGIN_SUCCESS);
            }
        }).start();
    }

    @Override
    public void clear() {
        mView.clearText();
    }
}
