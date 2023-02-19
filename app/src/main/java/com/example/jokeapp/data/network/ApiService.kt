package com.example.jokeapp.data.network

import retrofit2.http.GET

interface ApiService {

    @GET("Dark?type=single")
    suspend fun getJoke(

    ): JokeInfoDto
}