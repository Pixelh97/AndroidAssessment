package com.example.androidassessment.di

import com.example.androidassessment.data.api.ProfileApi
import com.example.androidassessment.data.dataSource.ProfileDataSource
import com.example.androidassessment.data.dataSource.remoteDataSource.ProfileDataSourceImpl
import com.example.androidassessment.data.repository.ProfileRepositoryImpl
import com.example.androidassessment.domian.repository.ProfileRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit
            .Builder()
            .baseUrl("https://raw.githubusercontent.com/android-assesment/profile/main/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideProfileApi(retrofit: Retrofit): ProfileApi = retrofit.create(ProfileApi::class.java)

    @Provides
    @Singleton
    fun provideProfileRepository(profileDataSource: ProfileDataSource): ProfileRepository = ProfileRepositoryImpl(profileDataSource)

    @Provides
    @Singleton
    fun provideProfileDataSource(api: ProfileApi): ProfileDataSource = ProfileDataSourceImpl(api)
}
