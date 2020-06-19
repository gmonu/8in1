package com.example.a10in1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class Web_pages extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_pages);
        // retrieve references to the Views defined in the activity_main.xml
        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView = (WebView) findViewById(R.id.webView);


        String[] possibilitiesStrings = {
                "Google",
                "My GitHub",
                "Yahoo!",
                "Wikipedia"
        };
        possibilities.setDisplayedValues(possibilitiesStrings);

        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length - 1);
    }

    public void navigate(View v) {

        int choice = possibilities.getValue();
        webView.setWebViewClient(new WebViewClient());
        // load the appropriate web page
        if (choice == 0) {
            // load the android.html page stored in the assets of the application
            webView.loadUrl("https://www.google.com/");
        } else if (choice == 1)
            // load the checklist.html page stored in the assets of the application
            webView.loadUrl("https://github.com/gmonu");
        else if (choice == 2)
            // load the coursera web page from the Internet
            // -> require modification to the AndroidManisfest.xml file:
            //  <uses-permission android:name="android.permission.INTERNET"/>
            webView.loadUrl("https://login.yahoo.com/");
        else if (choice == 3)
            // load the supelec.html page stored in the assets of the application
            webView.loadUrl("https://www.wikipedia.org/");
    }
}
