package com.example.androidassessment.data.dataSource

import com.example.androidassessment.data.model.ProfileResponseDto

interface ProfileDataSource {
    suspend fun getProfile(): ProfileResponseDto
}
