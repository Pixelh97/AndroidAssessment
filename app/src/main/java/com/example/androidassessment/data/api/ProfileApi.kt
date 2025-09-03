package com.example.androidassessment.data.api

import android.R.attr.data
import com.example.androidassessment.data.model.ProfileResponseDto
import retrofit2.http.GET

interface ProfileApi {
    @GET("data.json")
    suspend fun getProfile(): ProfileResponseDto
}
