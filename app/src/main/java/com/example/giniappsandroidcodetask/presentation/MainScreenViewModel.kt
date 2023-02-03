package com.example.giniappsandroidcodetask.presentation

import androidx.lifecycle.viewModelScope
import com.example.giniappsandroidcodetask.domain.entities.NumberState
import com.example.giniappsandroidcodetask.domain.entities.NumberStatesHolder
import com.example.giniappsandroidcodetask.domain.useCases.FetchDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    fetchDataUseCase: FetchDataUseCase
) : BaseMainScreenViewModel() {

    override val data = MutableStateFlow<List<NumberState>>(value = emptyList())

    init {
        viewModelScope.launch {
            val receivedData = fetchDataUseCase.invoke()
            data.value = NumberStatesHolder(numbers = receivedData).getNumberStates()
        }
    }
}