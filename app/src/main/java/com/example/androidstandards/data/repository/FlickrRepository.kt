package com.example.androidstandards.data.repository

import com.example.androidstandards.data.network.FlickrNetworkDataSource
import com.example.androidstandards.data.network.model.FlickrItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface FlickrRepo {
    val items : Flow<List<FlickrItem>>
}

class FlickrRepository @Inject constructor(
    val flickrNetworkDataSource: FlickrNetworkDataSource
): FlickrRepo{
    override val items: Flow<List<FlickrItem>> = flow { emit(flickrNetworkDataSource.getItems()) }
}
