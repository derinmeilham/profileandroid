package com.derin.tugasUTS.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.derin.tugasUTS.R;

//NIM   : 10116004
//NAMA  : Derin Meilham
//Kelas : IF1
//Pengerjaan : 21 Mei 2019

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), OnBoardingActivity.class));
                    finish();
                }
            }, 2000L); //2000 L = 2 detik
        }
    }
