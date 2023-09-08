package com.example.androidstandards.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.androidstandards.data.network.model.FlickrItem;
import com.example.androidstandards.data.repository.FlickrRepo;
import com.example.androidstandards.viewmodel.HomeUiState.Success;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/androidstandards/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "flickrRepo", "Lcom/example/androidstandards/data/repository/FlickrRepo;", "(Lcom/example/androidstandards/data/repository/FlickrRepo;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/androidstandards/viewmodel/HomeUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.androidstandards.data.repository.FlickrRepo flickrRepo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.androidstandards.viewmodel.HomeUiState> uiState = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.androidstandards.data.repository.FlickrRepo flickrRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.androidstandards.viewmodel.HomeUiState> getUiState() {
        return null;
    }
}