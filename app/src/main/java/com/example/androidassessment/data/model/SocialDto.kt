package com.example.androidassessment.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SocialDto(
    @SerialName("profiles")
    val profiles: List<ProfileDto>,
    @SerialName("website")
    val website: String
)