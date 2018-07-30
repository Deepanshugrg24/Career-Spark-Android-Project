package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Coaching extends AppCompatActivity {
    WebView Coaching;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaching);
        Coaching=(WebView)findViewById(R.id.wvCoaching);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        loadHTMLPage();
    }
    public void loadHTMLPage(){
        Coaching.getSettings().setJavaScriptEnabled(true);
        Coaching.getSettings().setBuiltInZoomControls(true);
        Coaching.loadUrl("file:///android_asset/coaching.html");

    }
}
