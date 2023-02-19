package com.example.jokeapp.domain

import androidx.lifecycle.LiveData
import com.example.jokeapp.domain.entity.JokeInfo

interface JokeRepository {

    fun getJoke(category: String): LiveData<JokeInfo>

    fun loadJoke()
}