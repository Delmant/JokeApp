package com.example.jokeapp.data.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import com.example.jokeapp.data.database.JokeDatabase
import com.example.jokeapp.data.mapper.JokeMapper
import com.example.jokeapp.data.network.ApiFactory
import com.example.jokeapp.domain.entity.JokeInfo
import com.example.jokeapp.domain.JokeRepository

class JokeRepositoryImpl(
    application: Application
): JokeRepository {

    private val jokeDao = JokeDatabase.getInstance(application).JokeDao()
    private val apiService = ApiFactory.apiService
    private val mapper = JokeMapper()

    override fun getJoke(id: Int): LiveData<JokeInfo> {
        return Transformations.map(jokeDao.getJoke(id)) {
            mapper.mapDbModelToEntity(it)
        }
    }

    override suspend fun loadJoke() {
        val jokeDto = apiService.getJoke()
        jokeDao.insertJoke(mapper.mapDtoToDbModel(jokeDto))
        Log.d("JOKE", apiService.getJoke().toString())
    }
}