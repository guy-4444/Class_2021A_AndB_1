package com.classy.class_2021a_andb_1;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MySignal.initHelper(this);
    }

}
