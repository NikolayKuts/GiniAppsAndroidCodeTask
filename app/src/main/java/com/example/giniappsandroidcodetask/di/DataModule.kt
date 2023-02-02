package com.example.giniappsandroidcodetask.di

import com.example.giniappsandroidcodetask.data.api.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun providesAipService(): ApiClient = ApiClient
}