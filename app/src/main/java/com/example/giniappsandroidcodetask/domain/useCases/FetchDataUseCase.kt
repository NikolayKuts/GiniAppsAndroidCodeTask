package com.example.giniappsandroidcodetask.domain.useCases

import com.example.giniappsandroidcodetask.domain.entities.Numbers
import com.example.giniappsandroidcodetask.domain.repositories.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class FetchDataUseCase @Inject constructor(private val repository: DataRepository) {

    suspend operator fun invoke(): Numbers = withContext(Dispatchers.IO) {
        repository.fetchData()
    }
}