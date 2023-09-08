package com.example.androidstandards.data.network

import com.example.androidstandards.data.network.model.FlickrItem

interface FlickrNetworkDataSource {
    suspend fun getItems(): List<FlickrItem>
}
