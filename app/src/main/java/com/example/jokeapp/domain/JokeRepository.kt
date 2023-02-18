package com.example.jokeapp.domain

import androidx.lifecycle.LiveData

interface JokeRepository {

    fun getJoke(category: String): LiveData<JokeInfo>

    fun loadJoke()
}