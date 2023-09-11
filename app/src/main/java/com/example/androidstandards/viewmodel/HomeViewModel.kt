package com.example.androidstandards.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidstandards.data.network.model.FlickrItem
import com.example.androidstandards.data.repository.FlickrRepo
import com.example.androidstandards.viewmodel.HomeUiState.Success
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    flickrRepo: FlickrRepo
): ViewModel() {

    val uiState: StateFlow<HomeUiState> = flickrRepo
        .items.map<List<FlickrItem>, HomeUiState>(::Success)
        .catch { emit(HomeUiState.Error(it)) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), HomeUiState.Loading)
}

sealed interface HomeUiState {
    object Loading: HomeUiState
    data class Error(val throwable: Throwable): HomeUiState
    data class Success(val data: List<FlickrItem>): HomeUiState
}
