package com.memo.newsapp.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.memo.newsapp.ui.components.Loader
import com.memo.newsapp.ui.viewmodel.NewsViewModel
import com.memo.utilitis.ResourceState

const val TAG = "HomeScreen"

@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    val newsResponse = newsViewModel.news.collectAsState()
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        when (newsResponse.value) {
            is ResourceState.Loading -> {
                // Show loading indicator
                Log.d(TAG, "HomeScreen: Loading")
                Loader()
            }

            is ResourceState.Success -> {
                // Show news list
                val response = (newsResponse.value as ResourceState.Success).data
                Log.d(TAG, "HomeScreen: Success ${response.status} ${response.totalResults}")
            }

            is ResourceState.Error -> {
                // Show error message
                Log.d(TAG, "HomeScreen: Error")
                val error = (newsResponse.value as ResourceState.Error).message
                Log.d(TAG, "HomeScreen: Error $error")
            }
        }
    }
}