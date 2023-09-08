package com.example.androidstandards.data.di;

import com.example.androidstandards.data.network.FlickrNetworkDataSource;
import com.example.androidstandards.data.network.RetrofitFlickrNetwork;
import com.example.androidstandards.data.repository.FlickrRepo;
import com.example.androidstandards.data.repository.FlickrRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/androidstandards/data/di/BindModule;", "", "bindsFlickrRepository", "Lcom/example/androidstandards/data/repository/FlickrRepo;", "flickrRepository", "Lcom/example/androidstandards/data/repository/FlickrRepository;", "bindsRetrofitFlickrNetwork", "Lcom/example/androidstandards/data/network/FlickrNetworkDataSource;", "retrofitFlickrNetwork", "Lcom/example/androidstandards/data/network/RetrofitFlickrNetwork;", "app_debug"})
@dagger.Module
public abstract interface BindModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.example.androidstandards.data.repository.FlickrRepo bindsFlickrRepository(@org.jetbrains.annotations.NotNull
    com.example.androidstandards.data.repository.FlickrRepository flickrRepository);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.example.androidstandards.data.network.FlickrNetworkDataSource bindsRetrofitFlickrNetwork(@org.jetbrains.annotations.NotNull
    com.example.androidstandards.data.network.RetrofitFlickrNetwork retrofitFlickrNetwork);
}