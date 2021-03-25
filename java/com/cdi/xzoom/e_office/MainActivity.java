package com.officia.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.mybrowser);

                WebView view = new WebView(this);
                view.getSettings().setJavaScriptEnabled(true);
                view.setWebViewClient(new WebViewClient());
                view.loadUrl("https://officiacentre.000webhostapp.com/Login/login1.php");
                setContentView(view);
                view.getSettings().setBuiltInZoomControls(true);
                view.getSettings().setDisplayZoomControls(false);
                myWebView.setWebViewClient(new WebViewClient());

        String cookies = CookieManager.getInstance().getCookie("https://officiacentre.000webhostapp.com");
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        else {
            View decorView = getWindow().getDecorView();
            // Show Status Bar.
            int uiOptions = View.SYSTEM_UI_FLAG_VISIBLE;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }
}
