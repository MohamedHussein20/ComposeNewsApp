package com.memo.newsapp.data.datasource

import com.memo.newsapp.data.api.ApiService
import com.memo.newsapp.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getTopHeadlines(country: String): Response<NewsResponse> {
        return apiService.getTopHeadlines(country)
    }
}