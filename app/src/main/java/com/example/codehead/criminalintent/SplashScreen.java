package com.example.codehead.criminalintent;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_splash_screen);

//        ActionBar actionBar=getSupportActionBar();
//        actionBar.hide();
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
            Intent intent=new Intent(SplashScreen.this,LoginActivity.class);
            startActivity(intent);
            finish();
           }
       },SPLASH_TIME_OUT);

    }
}
