package com.memo.newsapp.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.memo.newsapp.ui.components.Loader
import com.memo.newsapp.ui.components.NewsList
import com.memo.newsapp.ui.components.NewsRowComponent
import com.memo.newsapp.ui.viewmodel.NewsViewModel
import com.memo.utilitis.ResourceState

const val TAG = "HomeScreen"

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {

    val newsResponse = newsViewModel.news.collectAsState()
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f

    ) {
        100
    }
    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp
    ) { page: Int ->
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
                    if (response.articles.isNotEmpty()) {
                        NewsRowComponent(page, response.articles[page])
                    }

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

}

