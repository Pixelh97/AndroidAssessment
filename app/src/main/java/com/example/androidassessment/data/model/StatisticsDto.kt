package com.example.androidassessment.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatisticsDto(
    @SerialName("activity")
    val activity: ActivityDto,
    @SerialName("followers")
    val followers: Int,
    @SerialName("following")
    val following: Int
)