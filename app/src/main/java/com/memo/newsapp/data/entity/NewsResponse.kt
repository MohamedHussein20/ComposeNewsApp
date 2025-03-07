package com.memo.newsapp.data.entity

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)