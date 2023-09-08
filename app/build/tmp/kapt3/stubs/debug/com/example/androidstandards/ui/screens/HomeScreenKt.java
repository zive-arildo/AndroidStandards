package com.example.androidstandards.ui.screens;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.androidstandards.data.network.model.FlickrItem;
import com.example.androidstandards.viewmodel.HomeUiState;
import com.example.androidstandards.viewmodel.HomeViewModel;

@kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.material3.ExperimentalMaterial3Api.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u00a8\u0006\u000b"}, d2 = {"HomeScreen", "", "viewModel", "Lcom/example/androidstandards/viewmodel/HomeViewModel;", "onItemClick", "Lkotlin/Function1;", "", "items", "", "Lcom/example/androidstandards/data/network/model/FlickrItem;", "PreviewHomeScreen", "app_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    com.example.androidstandards.viewmodel.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.androidstandards.data.network.model.FlickrItem> items, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void PreviewHomeScreen() {
    }
}