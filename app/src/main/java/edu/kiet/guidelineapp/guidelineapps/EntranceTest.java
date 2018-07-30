
package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class EntranceTest extends AppCompatActivity {
    WebView entrance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_test);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        entrance=(WebView)findViewById(R.id.wventrance);
        loadHTMLPage();
    }

    private void loadHTMLPage(){
        entrance.getSettings().setJavaScriptEnabled(true);
        entrance.getSettings().setBuiltInZoomControls(true);
        entrance.loadUrl("file:///android_asset/entrance.html");
    }
}
