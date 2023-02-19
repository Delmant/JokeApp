package com.example.jokeapp.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.jokeapp.data.database.JokeDatabase
import com.example.jokeapp.data.network.ApiFactory
import com.example.jokeapp.domain.JokeInfo
import com.example.jokeapp.domain.JokeRepository

class JokeRepositoryImpl(
    application: Application
): JokeRepository {

    private val jokeDao = JokeDatabase.getInstance(application).JokeDao()
    private val apiService = ApiFactory.apiService

    override fun getJoke(category: String): LiveData<JokeInfo> {
        TODO("Not yet implemented")
    }

    override fun loadJoke() {
        TODO("Not yet implemented")
    }
}