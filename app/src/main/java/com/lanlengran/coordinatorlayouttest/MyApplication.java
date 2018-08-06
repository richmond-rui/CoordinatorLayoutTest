package com.lanlengran.coordinatorlayouttest;

import android.app.Application;

/**
 * Created by ruiqin on 2018/8/3.
 */

public class MyApplication extends Application {
    private static MyApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
    }

    public static MyApplication getApplication() {
        return application;
    }
}
