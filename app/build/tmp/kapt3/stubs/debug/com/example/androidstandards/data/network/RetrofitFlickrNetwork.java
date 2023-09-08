package com.example.androidstandards.data.network;

import android.content.Context;
import com.example.androidstandards.R;
import com.example.androidstandards.data.network.model.FlickrItem;
import dagger.hilt.android.qualifiers.ApplicationContext;
import okhttp3.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/androidstandards/data/network/RetrofitFlickrNetwork;", "Lcom/example/androidstandards/data/network/FlickrNetworkDataSource;", "context", "Landroid/content/Context;", "okHttpCallFactory", "Lokhttp3/Call$Factory;", "(Landroid/content/Context;Lokhttp3/Call$Factory;)V", "networkApi", "Lcom/example/androidstandards/data/network/RetrofitFlickrNetworkApi;", "kotlin.jvm.PlatformType", "getItems", "", "Lcom/example/androidstandards/data/network/model/FlickrItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class RetrofitFlickrNetwork implements com.example.androidstandards.data.network.FlickrNetworkDataSource {
    private final com.example.androidstandards.data.network.RetrofitFlickrNetworkApi networkApi = null;
    
    @javax.inject.Inject
    public RetrofitFlickrNetwork(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context, @org.jetbrains.annotations.NotNull
    okhttp3.Call.Factory okHttpCallFactory) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.androidstandards.data.network.model.FlickrItem>> continuation) {
        return null;
    }
}