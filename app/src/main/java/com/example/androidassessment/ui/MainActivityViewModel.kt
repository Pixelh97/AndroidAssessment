package com.example.androidassessment.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainActivityViewModel : ViewModel() {
    private val _profileScreenUiState = MutableStateFlow(ProfileScreenUiState())
    val profileScreenUiState: StateFlow<ProfileScreenUiState> = _profileScreenUiState.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {
        TODO("Not yet implemented")
    }
}
