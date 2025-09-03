package com.example.androidassessment.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProfileDto(
    @SerialName("platform")
    val platform: String,
    @SerialName("url")
    val url: String
)