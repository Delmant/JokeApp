package com.example.jokeapp.data.network

import com.example.jokeapp.data.network.model.JokeInfoDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("Dark")
    suspend fun getJoke(
        @Query(QUERY_PARAM_TYPE) type: String
    ): JokeInfoDto

    companion object {
        private const val QUERY_PARAM_TYPE = "type"
    }
}