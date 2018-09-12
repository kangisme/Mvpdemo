package com.kang.mvpdemo;

/**
 * @author created by Administrator on 2018/9/5 0005 11:47
 */
public interface IPresenter {
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     */
    public void login(String username, String password);

    /**
     * 清除用户名和密码输入框
     */
    public void clear();
}
