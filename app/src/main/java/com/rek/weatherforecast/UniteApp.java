package com.rek.weatherforecast;

import android.app.Application;

import org.xutils.x;


/*  自定义的app，需要在Manifest中声明，
*   声明之后一进入到应用就会自动加载这个类并且执行OnCreate方法
*
* !!!不同包之间的加载，必须加public 否则出现权限Exception闪退
*  */
public class UniteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
