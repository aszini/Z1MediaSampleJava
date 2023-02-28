package com.example.z1mediasamplejava.application;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.z1media.android.sdk.Z1AppOpenAd;
import com.z1media.android.sdk.listeners.Z1AppOpenI;
import com.z1media.android.sdk.manager.Z1MediaManager;

public class MyApplication extends Application {

    public Z1AppOpenAd appOpenAd;

    @Override
    public void onCreate() {
        super.onCreate();


        appOpenAd = new  Z1AppOpenAd.Builder(this)
                .setTagName("in-app-sample-ap-Z1")
                .setAppOpenListener(new Z1AppOpenI() {
                    @Override
                    public void onAdFailedToLoad(@NonNull String s) {

                    }

                    @Override
                    public void onAdLoaded() {

                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {

                    }

                    @Override
                    public void onAdShowedFullScreenContent() {

                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(String s) {

                    }
                }).build();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // if using MultiDexApplication not required Z1MediaManager.initMultiDex function
        Z1MediaManager.initMultiDex(this);
    }
}
