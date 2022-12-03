package com.rakamin.newsapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\r0\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rakamin/newsapp/ui/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/rakamin/newsapp/data/NewsRepository;", "(Lcom/rakamin/newsapp/data/NewsRepository;)V", "deleteNews", "", "news", "Lcom/rakamin/newsapp/data/local/entity/NewsEntity;", "getBookmarkedNews", "Landroidx/lifecycle/LiveData;", "", "getHeadlineNews", "Lcom/rakamin/newsapp/data/Result;", "saveNews", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.rakamin.newsapp.data.NewsRepository newsRepository = null;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.rakamin.newsapp.data.NewsRepository newsRepository) {
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
    
    public final void saveNews(@org.jetbrains.annotations.NotNull()
    com.rakamin.newsapp.data.local.entity.NewsEntity news) {
    }
    
    public final void deleteNews(@org.jetbrains.annotations.NotNull()
    com.rakamin.newsapp.data.local.entity.NewsEntity news) {
    }
}