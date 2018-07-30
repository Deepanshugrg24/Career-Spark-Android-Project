package com.example.guidelineapp.guidelineapps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FlashScreen extends AppCompatActivity {
    private static  int flashtimeout=2200;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        iv=(ImageView)findViewById(R.id.img1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in=new Intent(FlashScreen.this,Tab1.class);
                startActivity(in);
                finish();

            }
        },flashtimeout);


    }
}
