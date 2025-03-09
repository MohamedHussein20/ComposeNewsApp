package com.memo.newsapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.memo.newsapp.ui.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
) : ViewModel() {
    fun getNews() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = newsRepository.getTopHeadlines("us")
        }
    }
    companion object{
        const val TAG = "NewsViewModel"
    }
}