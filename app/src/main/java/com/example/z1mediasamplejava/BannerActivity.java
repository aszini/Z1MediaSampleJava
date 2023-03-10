package com.example.z1mediasamplejava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.z1mediasamplejava.databinding.ActivityBannerBinding;
import com.z1media.android.sdk.Z1BannerAd;
import com.z1media.android.sdk.listeners.Z1BannerAdsI;
import com.z1media.android.sdk.utils.Z1AdSize;

public class BannerActivity extends AppCompatActivity {

    ActivityBannerBinding binding;
    StringBuilder builder = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBannerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Z1BannerAd z1BannerAd = new Z1BannerAd.Builder(this)
                .setBannerView(binding.bannerAdsContainer)
                .setTagName("in-app-sample-b-Z1")
                .setAddSize(Z1AdSize.BANNER)
                .setZ1BannerAdListener(new Z1BannerAdsI() {
                    @Override
                    public void onAdImpression() {
                        builder.append("Add impression \n");
                        binding.textView.setText( builder.toString());
                    }

                    @Override
                    public void onAdLoaded() {
                        builder.append("Add loaded \n");
                        binding.textView.setText( builder.toString());
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull String s) {
                        builder.append("Add failed to load \n");
                        binding.textView.setText( builder.toString());
                    }

                    @Override
                    public void onAdClicked() {
                        builder.append("Add clicked \n");
                        binding.textView.setText( builder.toString());
                    }

                    @Override
                    public void onAdOpened() {
                        builder.append("Add opened \n");
                        binding.textView.setText( builder.toString());
                    }

                    @Override
                    public void onAdClosed() {
                        builder.append("Add closed \n");
                        binding.textView.setText( builder.toString());
                    }
                }).build();
        z1BannerAd.loadBannerAd();
    }
}