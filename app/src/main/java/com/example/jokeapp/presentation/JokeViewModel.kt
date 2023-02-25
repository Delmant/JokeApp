package com.example.jokeapp.presentation

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.jokeapp.data.repository.JokeRepositoryImpl
import com.example.jokeapp.domain.GetJokeUseCase
import com.example.jokeapp.domain.LoadJokeUseCase
import kotlinx.coroutines.launch

class JokeViewModel(application: Application): AndroidViewModel(application) {

    private val repository = JokeRepositoryImpl(application)

    private val getJokeUseCase = GetJokeUseCase(repository)
    private val loadJokeUseCase = LoadJokeUseCase(repository)

    init {
        viewModelScope.launch {
            loadJokeUseCase()
        }
    }
}