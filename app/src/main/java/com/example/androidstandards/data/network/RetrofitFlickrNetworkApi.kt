package com.example.androidstandards.data.network

import com.example.androidstandards.data.network.model.FlickrData
import retrofit2.http.GET

interface RetrofitFlickrNetworkApi {
    @GET(value = "photos_public.gne?tags=priime&format=json&nojsoncallback=1")
    suspend fun getItems(): FlickrData
}

