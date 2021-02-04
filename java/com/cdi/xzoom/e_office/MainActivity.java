package com.cdi.xzoom.e_office;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView view = new WebView(this);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/index.html");
        setContentView(view);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setDisplayZoomControls(false);

        
    }
}