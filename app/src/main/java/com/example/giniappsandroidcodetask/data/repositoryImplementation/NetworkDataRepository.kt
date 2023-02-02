package com.example.giniappsandroidcodetask.data.repositoryImplementation

import com.example.giniappsandroidcodetask.data.api.ApiClient
import com.example.giniappsandroidcodetask.data.mapToDomainEntity
import com.example.giniappsandroidcodetask.domain.entities.Numbers
import com.example.giniappsandroidcodetask.domain.repositories.DataRepository
import javax.inject.Inject

class NetworkDataRepository @Inject constructor(
    private val client: ApiClient
) : DataRepository {

    override suspend fun fetchData(): Numbers = client.apiService.fetchData().mapToDomainEntity()
}