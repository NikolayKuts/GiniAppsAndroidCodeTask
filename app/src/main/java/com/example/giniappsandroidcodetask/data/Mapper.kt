package com.example.giniappsandroidcodetask.data

import com.example.giniappsandroidcodetask.data.entities.NetworkData
import com.example.giniappsandroidcodetask.data.entities.NetworkNumber
import com.example.giniappsandroidcodetask.domain.entities.Numbers
import com.example.giniappsandroidcodetask.domain.entities.Number

fun NetworkData.mapToDomainEntity(): Numbers = Numbers(
    content = numbers.map { it.mapToDomainEntity() }
)

fun NetworkNumber.mapToDomainEntity(): Number = Number(value = value)