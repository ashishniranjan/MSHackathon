package com.example.rahul.mshack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        String html = "<iframe style='width: 100%' height=\"250\" src=\"https://www.youtube.com/embed/SSgqfMrF240\" frameborder=\"0\" allowfullscreen></iframe>";
        WebView webView = findViewById(R.id.video1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(html, "text/html", null);

        html = "<iframe style='width: 100%' height=\"250\" src=\"https://www.youtube.com/embed/3Arj5zlUPG4\" frameborder=\"0\" allowfullscreen></iframe>";
        webView = findViewById(R.id.video2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(html, "text/html", null);

        html = "<iframe style='width: 100%' height=\"250\" src=\"https://www.youtube.com/embed/ukzFI9rgwfU\" frameborder=\"0\" allowfullscreen></iframe>";
        webView = findViewById(R.id.video3);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(html, "text/html", null);

        html = "<iframe style='width: 100%' height=\"250\" src=\"https://www.youtube.com/embed/KdgQvgE3ji4\" frameborder=\"0\" allowfullscreen></iframe>";
        webView = findViewById(R.id.video4);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(html, "text/html", null);

        html = "<iframe style='width: 100%' height=\"250\" src=\"https://www.youtube.com/embed/XgCF58tuo2k\" frameborder=\"0\" allowfullscreen></iframe>";
        webView = findViewById(R.id.video5);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(html, "text/html", null);

    }
}
