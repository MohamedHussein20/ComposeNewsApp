package com.memo.utilitis

import android.content.Context
import android.net.ConnectivityManager

object CoreUtility {
    fun isInternetConnected(context: Context): Boolean{
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkCapabilities = connectivityManager.activeNetwork?: return false
        val actNw = connectivityManager.getNetworkCapabilities(networkCapabilities)?: return false
        val result = when{
            actNw.hasTransport(android.net.NetworkCapabilities.TRANSPORT_WIFI) -> true
            actNw.hasTransport(android.net.NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            actNw.hasTransport(android.net.NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false

        }
        return result
    }
}