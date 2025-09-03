package com.example.androidassessment.data.client

import com.example.androidassessment.data.api.ProfileApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class RetrofitClient(
    private val json: Json,
) {
    private val okHttpClient: OkHttpClient by lazy {
        OkHttpClient
            .Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    private val retrofit: Retrofit by lazy {
        val contentType = "application/json".toMediaType()
        Retrofit
            .Builder()
            .baseUrl("https://raw.githubusercontent.com/android-assesment/profile/refs/heads/main/data.json")
            .client(okHttpClient)
            .build()
    }

    fun profileApi(): ProfileApi = retrofit.create(ProfileApi::class.java)
}
