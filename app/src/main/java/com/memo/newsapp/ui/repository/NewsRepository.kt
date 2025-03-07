package com.memo.newsapp.ui.repository

import com.memo.newsapp.data.datasource.NewsDataSource
import com.memo.newsapp.data.entity.NewsResponse
import com.memo.utilitis.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository  @Inject constructor(
    private val newsDataSource: NewsDataSource
){
//    suspend fun getTopHeadlines(country: String): Response<NewsResponse> {
//        return newsDataSource.getTopHeadlines(country)
//    }
    suspend fun getTopHeadlines(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getTopHeadlines(country)
            if (response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {
                emit(ResourceState.Error("An error occurred"))
            }
        }.catch { e ->
            emit(ResourceState.Error(e.message ?: "An error occurred"))
        }
    }

}