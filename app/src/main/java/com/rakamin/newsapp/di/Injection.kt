package com.rakamin.newsapp.di

import android.content.Context
import com.rakamin.newsapp.data.NewsRepository
import com.rakamin.newsapp.data.local.room.NewsDatabase
import com.rakamin.newsapp.data.remote.retrofit.ApiConfig
import com.rakamin.newsapp.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        val appExecutors = AppExecutors()
        return NewsRepository.getInstance(apiService, dao, appExecutors)
    }
}