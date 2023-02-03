package com.example.giniappsandroidcodetask.presentation

import androidx.lifecycle.ViewModel
import com.example.giniappsandroidcodetask.domain.entities.NumberState
import kotlinx.coroutines.flow.StateFlow

abstract class BaseMainScreenViewModel : ViewModel() {

    abstract val data: StateFlow<List<NumberState>>
}