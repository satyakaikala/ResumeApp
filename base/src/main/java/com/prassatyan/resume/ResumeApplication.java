package com.prassatyan.resume;

import android.app.Application;

import com.prassatyan.resume.data.local.DataStorage;

/**
 * Application class
 *
 * @author Satya
 */
public class ResumeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataStorage.initialize(this);
    }
}
