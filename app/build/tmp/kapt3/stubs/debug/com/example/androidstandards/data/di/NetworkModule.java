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
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/example/androidstandards/data/di/NetworkModule;", "", "()V", "providesOkHttpCallFactory", "Lokhttp3/Call$Factory;", "app_debug"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.androidstandards.data.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.Call.Factory providesOkHttpCallFactory() {
        return null;
    }
}