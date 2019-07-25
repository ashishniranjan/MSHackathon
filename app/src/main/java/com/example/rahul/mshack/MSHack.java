package com.example.rahul.mshack;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;

public class MSHack extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, "6fd3a0df99b0528e32a01b9312cf1ef2");
    }

}
