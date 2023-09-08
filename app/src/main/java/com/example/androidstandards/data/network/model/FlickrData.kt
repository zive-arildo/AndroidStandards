package com.example.androidstandards.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class FlickrData(
    val title: String,
    val link: String,
    val description: String,
    val modified: String,
    val generator: String,
    val items: List<FlickrItem> = listOf()
)
