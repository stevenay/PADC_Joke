package com.passion.padc_joke;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dell on 6/24/2016.
 */
public class PADCJokeApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        context = null;
    }

    public static Context getContext() {
        return context;
    }
}
