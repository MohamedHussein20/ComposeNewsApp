package com.memo.utilitis

sealed class ResourceState<T> {
    class Loading<T> : ResourceState<T>()
    class Success<T>(val data: T) : ResourceState<T>()
    class Error<T>(val message: Any) : ResourceState<T>()

}