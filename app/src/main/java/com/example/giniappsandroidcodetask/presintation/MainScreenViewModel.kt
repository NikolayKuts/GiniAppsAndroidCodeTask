package com.example.giniappsandroidcodetask.presintation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.giniappsandroidcodetask.domain.entities.NumberState
import com.example.giniappsandroidcodetask.domain.entities.NumberStatesHolder
import com.example.giniappsandroidcodetask.domain.useCases.FetchDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    fetchDataUseCase: FetchDataUseCase
) : ViewModel() {

    private val _data = MutableStateFlow<List<NumberState>>(value = emptyList())
    val data: StateFlow<List<NumberState>> = _data

    init {
        viewModelScope.launch {
            val receivedData = fetchDataUseCase.invoke()
            _data.value = NumberStatesHolder(numbers = receivedData).getNumberStates()
        }
    }
}