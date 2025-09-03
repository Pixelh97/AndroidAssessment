package com.example.androidassessment.data.dataSource.remoteDataSource

import android.util.Log
import com.example.androidassessment.data.api.ProfileApi
import com.example.androidassessment.data.dataSource.ProfileDataSource
import com.example.androidassessment.data.model.ProfileResponseDto

class ProfileDataSourceImpl(
    private val profileApi: ProfileApi,
) : ProfileDataSource {
    override suspend fun getProfile(): ProfileResponseDto {
        Log.d("TAG", "getProfile: ")
        return profileApi.getProfile()
    }
}
