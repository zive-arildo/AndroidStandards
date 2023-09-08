package com.example.androidstandards.data.network.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class MediaImage(
    @SerializedName("m")
    val image: String
)
