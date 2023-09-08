package com.example.androidstandards.data.network

import android.content.Context
import com.example.androidstandards.R
import com.example.androidstandards.data.network.model.FlickrItem
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitFlickrNetwork @Inject constructor(
    @ApplicationContext context: Context,
    okHttpCallFactory: Call.Factory
): FlickrNetworkDataSource {
    private val networkApi = Retrofit.Builder()
        .baseUrl(context.resources.getString(R.string.base_url))
        .callFactory(okHttpCallFactory)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RetrofitFlickrNetworkApi::class.java)

    override suspend fun getItems(): List<FlickrItem> = networkApi.getItems().items
}