package com.kang.base;



import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author created by Administrator on 2018/9/12 0012 11:31
 */
public class Routers {
    private static final String APP = "/app/";

    private static final String HOME = "/home/";

    private static final String USER = "/user/";

    public static final String APP_MAIN = APP + "MainActivity";

    public static final String HOME_FRAGMENT = HOME + "HomeFragment";

    public static final String USER_FRAGMENT = USER + "UserFragment";

    /**
     * 根据url获取相应的Fragment
     */
    public static Fragment getFragment(String url) {
        return (android.support.v4.app.Fragment) ARouter.getInstance().build(url).navigation();
    }

}
