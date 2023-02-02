package com.example.giniappsandroidcodetask.di

import com.example.giniappsandroidcodetask.data.repositoryImplementation.NetworkDataRepository
import com.example.giniappsandroidcodetask.domain.repositories.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DomainModule {

    @Binds
    fun bindDataRepository(repository: NetworkDataRepository): DataRepository
}