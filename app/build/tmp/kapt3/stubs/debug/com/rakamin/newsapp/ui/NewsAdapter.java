package com.rakamin.newsapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/rakamin/newsapp/ui/NewsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/rakamin/newsapp/data/local/entity/NewsEntity;", "Lcom/rakamin/newsapp/ui/NewsAdapter$MyViewHolder;", "onBookmarkClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MyViewHolder", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.ListAdapter<com.rakamin.newsapp.data.local.entity.NewsEntity, com.rakamin.newsapp.ui.NewsAdapter.MyViewHolder> {
    private final kotlin.jvm.functions.Function1<com.rakamin.newsapp.data.local.entity.NewsEntity, kotlin.Unit> onBookmarkClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rakamin.newsapp.ui.NewsAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.rakamin.newsapp.data.local.entity.NewsEntity> DIFF_CALLBACK = null;
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.rakamin.newsapp.data.local.entity.NewsEntity, kotlin.Unit> onBookmarkClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rakamin.newsapp.ui.NewsAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.rakamin.newsapp.ui.NewsAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/rakamin/newsapp/ui/NewsAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/rakamin/newsapp/databinding/ItemNewsBinding;", "(Lcom/rakamin/newsapp/databinding/ItemNewsBinding;)V", "getBinding", "()Lcom/rakamin/newsapp/databinding/ItemNewsBinding;", "bind", "", "news", "Lcom/rakamin/newsapp/data/local/entity/NewsEntity;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.rakamin.newsapp.databinding.ItemNewsBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.rakamin.newsapp.databinding.ItemNewsBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.rakamin.newsapp.databinding.ItemNewsBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.rakamin.newsapp.data.local.entity.NewsEntity news) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/rakamin/newsapp/ui/NewsAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/rakamin/newsapp/data/local/entity/NewsEntity;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.rakamin.newsapp.data.local.entity.NewsEntity> getDIFF_CALLBACK() {
            return null;
        }
    }
}