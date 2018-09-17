package com.kang.user;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.kang.base.BaseFragment;
import com.kang.base.Routers;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author created by Administrator on 2018/9/12 0012 13:43
 */
@Route(path = Routers.USER_FRAGMENT)
public class UserFragment extends BaseFragment {
    @BindView(R2.id.user_text)
    TextView mUserText;

    @BindView(R2.id.user_button)
    Button mUserButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R2.id.user_text, R2.id.user_button})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.user_text) {
            Toast.makeText(getContext(), "user text", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.user_button) {
            Toast.makeText(getContext(), "user button", Toast.LENGTH_SHORT).show();
        }
    }
}
