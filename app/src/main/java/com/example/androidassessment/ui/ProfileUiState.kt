package com.example.androidassessment.ui

import com.example.androidassessment.domian.model.Platform

data class ProfileUiState(
    val username: String = "",
    val imageUrl: String = "",
    val name: String = "",
    val location: String = "",
    val followersCount: Int = 0,
    val followingCount: Int = 0,
    val website: String? = null,
    val socialMedia: List<Platform> = emptyList(),
    val shots: String = "",
    val collections: String = "",
)
