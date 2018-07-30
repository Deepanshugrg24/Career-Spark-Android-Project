package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;



public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.ssss);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        loadHTMLPage();
    }
    private void loadHTMLPage(){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("file:///android_asset/highschol.html");
    }
}
