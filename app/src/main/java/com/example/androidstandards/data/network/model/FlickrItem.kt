package com.example.androidstandards.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class FlickrItem(
    val title: String,
    val link: String = "",
    val url: String = "",
    val description: String = "",
    val author: String = "",
    val media: MediaImage = MediaImage(image = "")
)
