package com.example.giniappsandroidcodetask.data.api

import com.example.giniappsandroidcodetask.data.entities.NetworkData
import retrofit2.http.GET

interface DataApi {

    @GET("raw/8wJzytQX")
    suspend fun fetchData(): NetworkData
}