package com.memo.newsapp.ui.repository

import com.memo.newsapp.data.datasource.NewsDataSource
import com.memo.newsapp.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsRepository  @Inject constructor(
    private val newsDataSource: NewsDataSource
){
    suspend fun getTopHeadlines(country: String): Response<NewsResponse> {
        return newsDataSource.getTopHeadlines(country)
    }
}