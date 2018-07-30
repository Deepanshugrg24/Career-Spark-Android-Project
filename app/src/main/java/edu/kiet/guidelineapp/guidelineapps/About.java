package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {
WebView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        about=(WebView)findViewById(R.id.wvAbout);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        loadHTMLPage();
    }
    public void loadHTMLPage(){
        about.getSettings().setBuiltInZoomControls(true);
        about.getSettings().setJavaScriptEnabled(true);
        about.loadUrl("file:///android_asset/about.html");
    }
}
