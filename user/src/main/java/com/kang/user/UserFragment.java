package com.kang.user;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.kang.base.BaseFragment;
import com.kang.base.Routers;

/**
 * @author created by Administrator on 2018/9/12 0012 13:43
 */
@Route(path = Routers.USER_FRAGMENT)
public class UserFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        return view;
    }
}
