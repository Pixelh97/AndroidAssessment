package com.example.androidassessment.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidassessment.domian.repository.ProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel
    @Inject
    constructor(
        private val profileRepository: ProfileRepository,
    ) : ViewModel() {
        private val _profileScreenUiState = MutableStateFlow(ProfileScreenUiState())
        val profileScreenUiState: StateFlow<ProfileScreenUiState> = _profileScreenUiState.asStateFlow()

        init {
            loadData()
        }

        private fun loadData() {
            viewModelScope.launch {
                val profileState = profileRepository.getProfile().toProfileUiState()
                _profileScreenUiState.update {
                    it.copy(
                        profile = profileState,
                        isLoading = false,
                    )
                }
            }
        }
    }
