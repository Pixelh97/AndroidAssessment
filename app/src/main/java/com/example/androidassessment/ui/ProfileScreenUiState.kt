package com.example.androidassessment.ui

data class ProfileScreenUiState(
    val profile: ProfileUiState = ProfileUiState(),
    val isLoading: Boolean = true,
)
