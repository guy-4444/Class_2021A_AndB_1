package com.classy.class_2021a_andb_1;

import android.content.Context;
import android.widget.Toast;

public class MySignal {

    private static MySignal instance;
    private static Context appContext;

    public static MySignal getInstance() {
        return instance;
    }

    private MySignal(Context _appContext) {
        this.appContext = _appContext;
    }

    public static MySignal initHelper(Context _appContext) {
        if (instance == null)
            instance = new MySignal(_appContext);
        return instance;
    }


    public void toast(String message) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show();
    }
}
