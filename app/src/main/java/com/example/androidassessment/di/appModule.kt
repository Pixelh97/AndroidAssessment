package com.example.androidassessment.di

import com.example.androidassessment.data.api.ProfileApi
import com.example.androidassessment.data.dataSource.ProfileDataSource
import com.example.androidassessment.data.dataSource.remoteDataSource.ProfileDataSourceImpl
import com.example.androidassessment.data.repository.ProfileRepositoryImpl
import com.example.androidassessment.domian.repository.ProfileRepository
import com.example.androidassessment.ui.MainActivityViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule =
    module {
        single {
            Retrofit
                .Builder()
                .baseUrl("https://raw.githubusercontent.com/android-assesment/profile/refs/heads/main/data.json")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ProfileApi::class.java)
        }
        singleOf(::ProfileRepositoryImpl).bind<ProfileRepository>()
        singleOf(::ProfileDataSourceImpl).bind<ProfileDataSource>()
        viewModelOf(::MainActivityViewModel)
    }
