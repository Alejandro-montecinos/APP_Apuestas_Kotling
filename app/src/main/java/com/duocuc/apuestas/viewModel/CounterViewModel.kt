package com.duocuc.apuestas.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.duocuc.apuestas.repository.CounterRepository

class CounterViewModel : ViewModel() {
    private val repository = CounterRepository()
    var counter by mutableStateOf(repository.getCounter())
        private set

    fun increment() {
        counter = repository.increment()
    }

    fun decrement() {
        counter = repository.decrement()
    }
}