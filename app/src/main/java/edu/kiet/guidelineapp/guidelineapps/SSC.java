package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SSC extends AppCompatActivity {
    WebView ssc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssc);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        ssc=(WebView)findViewById(R.id.wvssc);
        loadHTMLPage();
    }
    public void loadHTMLPage(){
        ssc.getSettings().setJavaScriptEnabled(true);
        ssc.getSettings().setBuiltInZoomControls(true);
        ssc.loadUrl("file:///android_asset/ssc.html");

    }
}
