package com.example.androidassessment.domian.model

data class Profile(
    val username: String,
    val name: String,
    val imageUrl: String,
    val location: String,
    val website: String?,
    val profiles: List<Platform>,
    val followersCount: Int,
    val followingCount: Int,
    val shotsCount: Int,
    val collectionCount: Int,
)
