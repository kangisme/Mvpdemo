package com.kang.mvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.kang.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author created by Administrator on 2018/9/5 0005 14:04
 */
@Route(path = "/app/HomeActivity")
public class HomeActivity extends BaseActivity {
    @BindView(R.id.home_tab)
    TextView mHome;
    @BindView(R.id.user_tab)
    TextView mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.home_tab, R.id.user_tab})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_tab:
                break;
            case R.id.user_tab:
                ARouter.getInstance().build("/user/UserActivity").navigation();
                break;
        }
    }
}
