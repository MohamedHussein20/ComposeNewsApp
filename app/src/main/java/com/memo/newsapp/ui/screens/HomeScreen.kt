package com.memo.newsapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.memo.newsapp.ui.viewmodel.NewsViewModel
import com.memo.utilitis.ResourceState

@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    val newsResponse = newsViewModel.news.collectAsState()
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ) {
    }
}