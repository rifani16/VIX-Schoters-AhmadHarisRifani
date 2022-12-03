package com.rakamin.newsapp.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "news")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/rakamin/newsapp/data/local/entity/NewsEntity;", "", "title", "", "publishedAt", "urlToImage", "url", "isBookmarked", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setBookmarked", "(Z)V", "getPublishedAt", "()Ljava/lang/String;", "getTitle", "getUrl", "getUrlToImage", "app_debug"})
public final class NewsEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "publishedAt")
    private final java.lang.String publishedAt = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "urlToImage")
    private final java.lang.String urlToImage = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "url")
    private final java.lang.String url = null;
    @androidx.room.ColumnInfo(name = "bookmarked")
    private boolean isBookmarked;
    
    public NewsEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String urlToImage, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean isBookmarked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrlToImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final boolean isBookmarked() {
        return false;
    }
    
    public final void setBookmarked(boolean p0) {
    }
}