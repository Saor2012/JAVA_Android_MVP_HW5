package com.example.androidcalculator.app;

import android.app.Application;

import com.example.androidcalculator.BuildConfig;

import timber.log.Timber;

public class App extends Application {
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
