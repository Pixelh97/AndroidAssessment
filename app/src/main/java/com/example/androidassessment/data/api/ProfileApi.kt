package com.example.androidassessment.data.api

import com.example.androidassessment.data.model.ProfileResponseDto
import retrofit2.http.GET

interface ProfileApi {
    @GET
    suspend fun getProfile(): ProfileResponseDto
}
