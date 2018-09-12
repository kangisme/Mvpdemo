package com.kang.user;

import android.os.Bundle;
import android.widget.TextView;

import com.kang.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
public class UserActivity extends BaseActivity {

    @BindView(R2.id.text)
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
    }
}
