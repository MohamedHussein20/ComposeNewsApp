package com.memo.newsapp.data.datasource

import com.memo.newsapp.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {
    suspend fun getTopHeadlines(
       country: String,
    ): Response<NewsResponse>
}