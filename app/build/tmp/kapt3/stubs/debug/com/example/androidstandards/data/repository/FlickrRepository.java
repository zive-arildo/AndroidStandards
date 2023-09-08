package com.example.androidstandards.data.repository;

import com.example.androidstandards.data.network.FlickrNetworkDataSource;
import com.example.androidstandards.data.network.model.FlickrItem;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/androidstandards/data/repository/FlickrRepository;", "Lcom/example/androidstandards/data/repository/FlickrRepo;", "flickrNetworkDataSource", "Lcom/example/androidstandards/data/network/FlickrNetworkDataSource;", "(Lcom/example/androidstandards/data/network/FlickrNetworkDataSource;)V", "getFlickrNetworkDataSource", "()Lcom/example/androidstandards/data/network/FlickrNetworkDataSource;", "items", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/androidstandards/data/network/model/FlickrItem;", "getItems", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class FlickrRepository implements com.example.androidstandards.data.repository.FlickrRepo {
    @org.jetbrains.annotations.NotNull
    private final com.example.androidstandards.data.network.FlickrNetworkDataSource flickrNetworkDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.androidstandards.data.network.model.FlickrItem>> items = null;
    
    @javax.inject.Inject
    public FlickrRepository(@org.jetbrains.annotations.NotNull
    com.example.androidstandards.data.network.FlickrNetworkDataSource flickrNetworkDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.androidstandards.data.network.FlickrNetworkDataSource getFlickrNetworkDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.androidstandards.data.network.model.FlickrItem>> getItems() {
        return null;
    }
}