package com.example.rahul.mshack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class ChatBotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);

        String html =  "<iframe src='https://webchat.botframework.com/embed/onboardingqna-botting?s=9P_GL7rKVqE.bVV30nvEyZSN5MjX2XXFlrgjE5672lI9XZkBdk_rfos'  style='width: 100%;height: 95%'></iframe>";

        WebView webView = findViewById(R.id.chatBot);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(html, "text/html", null);

    }
}
