package com.memo.newsapp.data.api

import com.memo.newsapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "e9cd1aaa4d79449b84a86bad45cb4382"
    ): Response<NewsResponse>
}
//GET https://newsapi.org/v2/top-headlines?country=us&apiKey=e9cd1aaa4d79449b84a86bad45cb4382