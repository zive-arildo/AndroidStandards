package com.example.androidstandards.data.repository;

import com.example.androidstandards.data.network.FlickrNetworkDataSource;
import com.example.androidstandards.data.network.model.FlickrItem;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/androidstandards/data/repository/FlickrRepo;", "", "items", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/androidstandards/data/network/model/FlickrItem;", "getItems", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public abstract interface FlickrRepo {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.androidstandards.data.network.model.FlickrItem>> getItems();
}