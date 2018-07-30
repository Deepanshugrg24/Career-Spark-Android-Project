package com.example.guidelineapp.guidelineapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class OthersCourses extends AppCompatActivity {
    WebView othercourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_courses);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        othercourse=(WebView)findViewById(R.id.wvothers);
        loadHTMLPage();
    }
    public void loadHTMLPage(){
        othercourse.getSettings().setJavaScriptEnabled(true);
        othercourse.getSettings().setBuiltInZoomControls(true);
        othercourse.loadUrl("file:///android_asset/others.html");

    }

}
