package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BankCivil extends AppCompatActivity {
    WebView bankcivil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_civil);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        bankcivil=(WebView)findViewById(R.id.wvbankcivil);
        loadHTMLPage();
    }
    public void loadHTMLPage(){
        bankcivil.getSettings().setJavaScriptEnabled(true);
        bankcivil.getSettings().setBuiltInZoomControls(true);
        bankcivil.loadUrl("file:///android_asset/bankcivil.html");

    }
}
