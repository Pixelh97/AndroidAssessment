package com.example.androidassessment.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("avatar")
    val avatar: String,
    @SerialName("location")
    val location: LocationDto,
    @SerialName("name")
    val name: String,
    @SerialName("social")
    val social: SocialDto,
    @SerialName("statistics")
    val statistics: StatisticsDto,
    @SerialName("username")
    val username: String
)