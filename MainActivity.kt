package com.example.feedingrehydration

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(15, 45, 75)
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = false
        web.webViewClient = WebViewClient()
        web.setBackgroundColor(Color.rgb(245, 248, 252))
        setContentView(web)
        web.loadUrl("file:///android_asset/index.html")
    }
}
