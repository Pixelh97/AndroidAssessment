package com.example.androidassessment.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ActivityDto(
    @SerialName("collections")
    val collections: Int,
    @SerialName("shots")
    val shots: Int
)