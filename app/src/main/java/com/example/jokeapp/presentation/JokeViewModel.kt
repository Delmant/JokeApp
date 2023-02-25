package com.example.jokeapp.presentation

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.jokeapp.data.repository.JokeRepositoryImpl
import com.example.jokeapp.domain.GetJokeUseCase
import com.example.jokeapp.domain.LoadJokeUseCase

class JokeViewModel(application: Application): AndroidViewModel(application) {

    private val repository = JokeRepositoryImpl(application)

    private val getJokeUseCase = GetJokeUseCase(repository)
    private val loadJokeUseCase = LoadJokeUseCase(repository)

    init {
        loadJokeUseCase()
    }
}