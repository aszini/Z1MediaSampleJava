


package com.example.z1mediasamplejava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.z1mediasamplejava.databinding.ActivityRewardedVideoBinding;
import com.z1media.android.sdk.Z1RewardedVideoAd;
import com.z1media.android.sdk.listeners.Z1RewardedVideoI;

public class RewardedVideoActivity extends AppCompatActivity {

    ActivityRewardedVideoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRewardedVideoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        Z1RewardedVideoAd rewardedVideoAd = new Z1RewardedVideoAd.Builder(this)
                .setTagName("in-app-sample-rw-Z1")
                .setZ1RewardInterstitialI(new Z1RewardedVideoI() {
                    @Override
                    public void onUserEarnedReward(int amount, @NonNull String type) {

                        binding.title.setText("Reward Amount "+ amount +", type: "+type);
                    }

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
        rewardedVideoAd.loadRewardVideoAd();
    }
}