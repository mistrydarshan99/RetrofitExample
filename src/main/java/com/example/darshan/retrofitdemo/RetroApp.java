package com.example.darshan.retrofitdemo;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by darshan.mistry on 9/1/2015.
 */
public class RetroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
