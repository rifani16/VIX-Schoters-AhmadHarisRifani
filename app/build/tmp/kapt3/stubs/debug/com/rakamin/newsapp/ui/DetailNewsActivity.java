package com.rakamin.newsapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/rakamin/newsapp/ui/DetailNewsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "webView", "Landroid/webkit/WebView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "CallBack", "app_debug"})
public final class DetailNewsActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.webkit.WebView webView;
    
    public DetailNewsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/rakamin/newsapp/ui/DetailNewsActivity$CallBack;", "Landroid/webkit/WebViewClient;", "()V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "app_debug"})
    public static final class CallBack extends android.webkit.WebViewClient {
        
        public CallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceRequest request) {
            return false;
        }
    }
}