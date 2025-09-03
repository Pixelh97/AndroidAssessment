package com.example.androidassessment.data.repository

import com.example.androidassessment.data.dataSource.ProfileDataSource
import com.example.androidassessment.data.utils.toProfile
import com.example.androidassessment.domian.model.Profile
import com.example.androidassessment.domian.repository.ProfileRepository

class ProfileRepositoryImpl(
    private val profileDataSource: ProfileDataSource,
) : ProfileRepository {
    override suspend fun getProfile(): Profile {
        val response = profileDataSource.getProfile()
        return response.toProfile()
    }
}
