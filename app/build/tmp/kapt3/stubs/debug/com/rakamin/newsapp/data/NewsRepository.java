package com.rakamin.newsapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e0\nJ!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/rakamin/newsapp/data/NewsRepository;", "", "apiService", "Lcom/rakamin/newsapp/data/remote/retrofit/ApiService;", "newsDao", "Lcom/rakamin/newsapp/data/local/room/NewsDao;", "appExecutors", "Lcom/rakamin/newsapp/utils/AppExecutors;", "(Lcom/rakamin/newsapp/data/remote/retrofit/ApiService;Lcom/rakamin/newsapp/data/local/room/NewsDao;Lcom/rakamin/newsapp/utils/AppExecutors;)V", "getBookmarkedNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/rakamin/newsapp/data/local/entity/NewsEntity;", "getHeadlineNews", "Lcom/rakamin/newsapp/data/Result;", "setNewsBookmark", "", "news", "bookmarkState", "", "(Lcom/rakamin/newsapp/data/local/entity/NewsEntity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class NewsRepository {
    private final com.rakamin.newsapp.data.remote.retrofit.ApiService apiService = null;
    private final com.rakamin.newsapp.data.local.room.NewsDao newsDao = null;
    private final com.rakamin.newsapp.utils.AppExecutors appExecutors = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rakamin.newsapp.data.NewsRepository.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.rakamin.newsapp.data.NewsRepository instance;
    
    private NewsRepository(com.rakamin.newsapp.data.remote.retrofit.ApiService apiService, com.rakamin.newsapp.data.local.room.NewsDao newsDao, com.rakamin.newsapp.utils.AppExecutors appExecutors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rakamin.newsapp.data.Result<java.util.List<com.rakamin.newsapp.data.local.entity.NewsEntity>>> getHeadlineNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.rakamin.newsapp.data.local.entity.NewsEntity>> getBookmarkedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setNewsBookmark(@org.jetbrains.annotations.NotNull()
    com.rakamin.newsapp.data.local.entity.NewsEntity news, boolean bookmarkState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/rakamin/newsapp/data/NewsRepository$Companion;", "", "()V", "instance", "Lcom/rakamin/newsapp/data/NewsRepository;", "getInstance", "apiService", "Lcom/rakamin/newsapp/data/remote/retrofit/ApiService;", "newsDao", "Lcom/rakamin/newsapp/data/local/room/NewsDao;", "appExecutors", "Lcom/rakamin/newsapp/utils/AppExecutors;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.rakamin.newsapp.data.NewsRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.rakamin.newsapp.data.remote.retrofit.ApiService apiService, @org.jetbrains.annotations.NotNull()
        com.rakamin.newsapp.data.local.room.NewsDao newsDao, @org.jetbrains.annotations.NotNull()
        com.rakamin.newsapp.utils.AppExecutors appExecutors) {
            return null;
        }
    }
}