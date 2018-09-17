package com.kang.home;

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
 * @author created by Administrator on 2018/9/12 0012 12:00
 */
@Route(path = Routers.HOME_FRAGMENT)
public class HomeFragment extends BaseFragment {

    @BindView(R2.id.home_text)
    TextView mHomeText;

    @BindView(R2.id.home_button)
    Button mHomeButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R2.id.home_text, R2.id.home_button})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.home_text) {
            Toast.makeText(getContext(), "home text", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.home_button) {
            Toast.makeText(getContext(), "home button", Toast.LENGTH_SHORT).show();
        }
    }
}
