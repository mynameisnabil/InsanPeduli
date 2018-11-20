package com.example.test.insanpeduli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebView; // memasukan class WebView
import android.webkit.WebViewClient; //memasukan class WebViewClient

public class MainActivity extends AppCompatActivity {
    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tambahkan kode di bawah ini
        view = (WebView) this.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://idn.sch,id/");

    }
}
