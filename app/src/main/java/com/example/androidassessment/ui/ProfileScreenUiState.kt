package com.example.androidassessment.ui

import com.example.androidassessment.domian.model.Profile

data class ProfileScreenUiState(
    val profile: ProfileUiState = ProfileUiState(),
    val isLoading: Boolean = true,
)

fun Profile.toProfileUiState() =
    ProfileUiState(
        username = this.username,
        name = this.name,
        imageUrl = this.imageUrl,
        location = this.location,
        website = this.website,
        socialMedia = this.profiles,
        followersCount = this.followersCount.toString(),
        followingCount = this.followingCount.toString(),
        shots = "${this.shotsCount} shots",
        collections = "${this.collectionCount} collections",
    )
