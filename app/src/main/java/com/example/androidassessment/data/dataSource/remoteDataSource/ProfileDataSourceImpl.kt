package com.example.androidassessment.data.dataSource.remoteDataSource

import com.example.androidassessment.data.api.ProfileApi
import com.example.androidassessment.data.dataSource.ProfileDataSource
import com.example.androidassessment.data.model.ProfileResponseDto

class ProfileDataSourceImpl(
    private val profileApi: ProfileApi,
) : ProfileDataSource {
    override suspend fun getProfile(): ProfileResponseDto = profileApi.getProfile()
}
