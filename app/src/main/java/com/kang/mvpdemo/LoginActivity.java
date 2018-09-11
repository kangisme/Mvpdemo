package com.kang.mvpdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.kang.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements IView {

    @BindView(R.id.username)
    EditText mUsername;
    @BindView(R.id.password)
    EditText mPassword;
    @BindView(R.id.login)
    Button mLogin;
    @BindView(R.id.clear)
    Button mClear;
    @BindView(R.id.progress)
    LinearLayout mProgress;

    IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mPresenter = new LoginPresenter(this);
    }


    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showProgress(boolean isShow) {
        mProgress.setVisibility(isShow ? View.VISIBLE : View.GONE);
    }

    @Override
    public void clearText() {
        mUsername.setText("");
        mPassword.setText("");
    }

    @Override
    public void loginResult(boolean isSuccessful) {
        if (isSuccessful) {
            ARouter.getInstance().build("/app/HomeActivity").navigation();
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick({R.id.login, R.id.clear})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.login:
                mPresenter.login(mUsername.getText().toString(), mPassword.getText().toString());
                break;
            case R.id.clear:
                mPresenter.clear();
                break;
        }
    }
}
