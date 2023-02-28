package com.example.z1mediasamplejava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.z1mediasamplejava.databinding.ActivityInterstitialAdBinding;
import com.z1media.android.sdk.Z1InterstitialAd;
import com.z1media.android.sdk.listeners.Z1AdManagerInterstitialI;

public class InterstitialActivity extends AppCompatActivity {

    ActivityInterstitialAdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInterstitialAdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Z1InterstitialAd interstitialAd =  new Z1InterstitialAd.Builder(this)
                .setTagName("in-app-sample-in-Z1")
                .setZ1AdManagerInterstitialAdLoadCallback(new Z1AdManagerInterstitialI() {
                    @Override
                    public void onAdShowedFullScreenContent() {

                    }

                    @Override
                    public void onAdImpression() {

                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(@NonNull String s) {

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull String s) {

                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {

                    }

                    @Override
                    public void onAdClicked() {

                    }
                }).build();
        interstitialAd.loadInterstitialAd();
    }
}