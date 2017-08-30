package com.bwei.Test.zhangjian20170829.App;

import android.app.Application;

import org.xutils.x;

/**
 * @author ${张健}
 * @date 2017/8/29/14:29
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false); //输出debug日志，开启会影响性能
    }
}
