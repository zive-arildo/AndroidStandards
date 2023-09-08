package com.example.androidstandards.data.di

import com.example.androidstandards.data.network.FlickrNetworkDataSource
import com.example.androidstandards.data.network.RetrofitFlickrNetwork
import com.example.androidstandards.data.repository.FlickrRepo
import com.example.androidstandards.data.repository.FlickrRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun providesOkHttpCallFactory(): Call.Factory = OkHttpClient.Builder()
        .addInterceptor(
            HttpLoggingInterceptor()
                .apply {
                    setLevel(HttpLoggingInterceptor.Level.BODY)
                }
        )
        .build()
}

@Module
@InstallIn(SingletonComponent::class)
interface BindModule {

    @Singleton
    @Binds
    fun bindsFlickrRepository(flickrRepository: FlickrRepository): FlickrRepo

    @Singleton
    @Binds
    fun bindsRetrofitFlickrNetwork(retrofitFlickrNetwork: RetrofitFlickrNetwork): FlickrNetworkDataSource
}
