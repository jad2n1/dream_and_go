package com.example.pageaccueil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
ImageView splashImg, logo;
LottieAnimationView lottieAnimationView;
Handler montimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        logo = findViewById(R.id.fond_first);
        lottieAnimationView = findViewById(R.id.lottie_first);

        lottieAnimationView.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

    }



    @Override
    protected void onStart() {

        super.onStart();
        montimer = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        montimer.postDelayed(runnable, 4000);

        }

    }
    public void startActivity(Intent intent) {
        Intent intent=new Intent(SplashActivity.this, MainActivity.class); )
        super.startActivity(intent);
    }
}