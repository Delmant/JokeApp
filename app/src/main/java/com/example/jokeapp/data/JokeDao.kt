package com.example.jokeapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import retrofit2.http.GET

@Dao
interface JokeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertJoke(joke: JokeInfoDbModel)

    @GET("SELECT * FROM joke_db")
    fun getJoke(): LiveData<JokeInfoDbModel>
}