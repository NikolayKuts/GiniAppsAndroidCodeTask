package com.example.giniappsandroidcodetask.domain.repositories

import com.example.giniappsandroidcodetask.domain.entities.Numbers

interface DataRepository {

    suspend fun fetchData(): Numbers
}