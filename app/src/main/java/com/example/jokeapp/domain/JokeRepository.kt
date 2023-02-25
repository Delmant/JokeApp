package com.example.jokeapp.domain

import androidx.lifecycle.LiveData
import com.example.jokeapp.domain.entity.JokeInfo

interface JokeRepository {

    fun getJoke(id: Int): LiveData<JokeInfo>

    suspend fun loadJoke()
}