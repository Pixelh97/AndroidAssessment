package com.example.androidassessment.domian.repository

import com.example.androidassessment.domian.model.Profile

interface ProfileRepository {
    suspend fun getProfile(): Profile
}
