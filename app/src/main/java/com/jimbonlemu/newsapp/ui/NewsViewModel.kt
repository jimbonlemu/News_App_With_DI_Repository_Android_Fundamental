package com.jimbonlemu.newsapp.ui

import androidx.lifecycle.ViewModel
import com.jimbonlemu.newsapp.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository):ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()
}