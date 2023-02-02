package com.example.giniappsandroidcodetask.data.entities

import com.google.gson.annotations.SerializedName;

data class NetworkData(
    @SerializedName("numbers")
    val numbers: List<NetworkNumber>
)