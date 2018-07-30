package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AfterGraduation extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_graduation);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        webView=(WebView)findViewById(R.id.wv1);
        loadHTMLPage();
    }

    private void loadHTMLPage(){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("file:///android_asset/aftergraduation.html");
    }
}
