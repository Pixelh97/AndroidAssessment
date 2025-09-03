package com.example.androidassessment.ui

data class ProfileUiState(
    val username: String = "",
    val imageUrl: String = "",
    val name: String = "",
    val location: String = "",
    val followersCount: Int = 0,
    val followingCount: Int = 0,
    val socialMediaLinks: List<String> = emptyList(),
    val shots: String = "",
    val collections: String = "",
)
