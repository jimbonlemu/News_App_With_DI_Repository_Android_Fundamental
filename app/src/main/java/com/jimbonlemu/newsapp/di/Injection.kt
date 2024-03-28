package com.jimbonlemu.newsapp.di

import android.content.Context
import com.jimbonlemu.newsapp.data.NewsRepository
import com.jimbonlemu.newsapp.data.local.room.NewsDatabase
import com.jimbonlemu.newsapp.data.remote.retrofit.ApiConfig
import com.jimbonlemu.newsapp.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context) :NewsRepository{
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        val appExecutors = AppExecutors()
        return NewsRepository.getInstance(apiService, dao, appExecutors)
    }
}