package com.example.z1mediasamplejava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.z1mediasamplejava.databinding.ActivityNativeTemplateAdBinding;
import com.z1media.android.sdk.BuildConfig;
import com.z1media.android.sdk.Z1NativeAd;
import com.z1media.android.sdk.listeners.Z1NativeAdsI;
import com.z1media.android.sdk.utils.Z1MediaAspectRatio;

public class NativeTemplateAdActivity extends AppCompatActivity {

    ActivityNativeTemplateAdBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNativeTemplateAdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        smallNativeAd();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_native_ad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.small_native_ad:
                smallNativeAd();
                break;
            case R.id.medium_native_ad:
                mediumNativeAd();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void smallNativeAd(){
        binding.templateSmall.setVisibility(View.VISIBLE);
        binding.templateMedium.setVisibility(View.GONE);

        Z1NativeAd nativeAd = new Z1NativeAd.Builder(this)
                .setTemplateView(binding.templateSmall)
                .setTagName("in-app-sample-n-Z1")
                .setEnvironment(BuildConfig.BUILD_TYPE)
                .setMediaAspectRatio(Z1MediaAspectRatio.PORTRAIT)
                .setBackgroundColor(R.color.white)
                .setNativeAdListener(new Z1NativeAdsI() {
                    @Override
                    public void onAdLoaded() {

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull String s) {

                    }

                    @Override
                    public void onAdImpression() {

                    }

                    @Override
                    public void onAdClosed() {

                    }
                }).build();
        nativeAd.loadNativeAd();

    }

    private void mediumNativeAd(){

        binding.templateSmall.setVisibility(View.GONE);
        binding.templateMedium.setVisibility(View.VISIBLE);

        Z1NativeAd nativeAd = new Z1NativeAd.Builder(this)
                .setTemplateView(binding.templateMedium)
                .setTagName("in-app-sample-n-Z1")
                .setMediaAspectRatio(Z1MediaAspectRatio.PORTRAIT)
                .setBackgroundColor(R.color.white)
                .setNativeAdListener(new Z1NativeAdsI() {
                    @Override
                    public void onAdLoaded() {

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull String s) {

                    }

                    @Override
                    public void onAdImpression() {

                    }

                    @Override
                    public void onAdClosed() {

                    }
                }).build();
        nativeAd.loadNativeAd();


    }

}