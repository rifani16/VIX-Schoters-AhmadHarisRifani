package com.rakamin.newsapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/rakamin/newsapp/utils/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/Executor;", "getDiskIO", "()Ljava/util/concurrent/Executor;", "mainThread", "getMainThread", "networkIO", "getNetworkIO", "MainThreadExecutor", "app_debug"})
public final class AppExecutors {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.Executor diskIO = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.Executor networkIO = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.Executor mainThread = null;
    
    public AppExecutors() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor getDiskIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor getNetworkIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor getMainThread() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/rakamin/newsapp/utils/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "app_debug"})
    static final class MainThreadExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mainThreadHandler = null;
        
        public MainThreadExecutor() {
            super();
        }
        
        @java.lang.Override()
        public void execute(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable command) {
        }
    }
}