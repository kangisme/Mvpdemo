package com.kang.user;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.kang.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
@Route(path = "/user/UserActivity")
public class UserActivity extends BaseActivity {

    @BindView(R2.id.text)
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
