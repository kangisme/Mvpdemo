package com.kang.mvpdemo;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.kang.base.BaseActivity;
import com.kang.base.Routers;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author created by Administrator on 2018/9/5 0005 14:04
 */
@Route(path = Routers.APP_MAIN)
public class MainActivity extends BaseActivity {

    @BindView(R.id.home_tab)
    TextView mHome;

    @BindView(R.id.user_tab)
    TextView mUser;

    @BindView(R.id.content)
    FrameLayout mContent;

    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    private ViewPagerAdapter mAdapter;

    private List<Fragment> mFragments;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mFragments = new ArrayList<>();
        mFragments.add(Routers.getFragment(Routers.HOME_FRAGMENT));
        mFragments.add(Routers.getFragment(Routers.USER_FRAGMENT));
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
    }

    @OnClick({R.id.home_tab, R.id.user_tab})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_tab:
                if (mFragments.size() > 0) {
                    mViewPager.setCurrentItem(0);
                }
                break;
            case R.id.user_tab:
                if (mFragments.size() > 1) {
                    mViewPager.setCurrentItem(1);
                }
                break;
        }
    }

    private class ViewPagerAdapter extends FragmentStatePagerAdapter {

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
    }

}
