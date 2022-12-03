package com.rakamin.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rakamin.newsapp.data.NewsRepository
import com.rakamin.newsapp.data.local.entity.NewsEntity
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository): ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()
    
    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
    
    fun saveNews(news: NewsEntity) {
        viewModelScope.launch {
            newsRepository.setNewsBookmark(news, true)
        }
    }
    
    fun deleteNews(news: NewsEntity) {
        viewModelScope.launch {
            newsRepository.setNewsBookmark(news, false)
        }
    }
}