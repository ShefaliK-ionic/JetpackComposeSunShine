package com.jetpack_compose.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MyViewModel: ViewModel() {

    private var _counter = 0
    val counter: Int
        get() = _counter

    fun incrementCounter() {
        _counter++
    }

    //live data
    private val _text = MutableLiveData("Initial value")
    val text: LiveData<String> = _text

    fun updateText(newText: String) {
        _text.value = newText
    }

    //stateflow
    private val _uiState = MutableStateFlow("Initial state")
    val uiState: StateFlow<String> = _uiState

    fun updateState(newValue: String) {
        _uiState.value = newValue
    }

}