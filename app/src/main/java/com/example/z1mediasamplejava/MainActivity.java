package com.example.z1mediasamplejava;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.z1mediasamplejava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    /** Override the default implementation when the user presses the back key. */
    @Override
    public void onBackPressed() {
        // Move the task containing the MainActivity to the back of the activity stack, instead of
        // destroying it. Therefore, MainActivity will be shown when the user switches back to the app.
        moveTaskToBack(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.main, menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.banner_ad:
                startActivity(new Intent(this, BannerActivity.class));
                break;
            case R.id.interstitialAd:
               startActivity(new Intent(this, InterstitialActivity.class));
                break;
            case R.id.rewarded_videoAd:
                startActivity(new Intent(this, RewardedVideoActivity.class));
                break;
            case R.id.native_template_ad:
                startActivity(new Intent(this, NativeTemplateAdActivity.class));
                break;
            case R.id.rewarded_interstitial_ad:
                startActivity(new Intent(this, RewardedInterstitialActivity.class));
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}