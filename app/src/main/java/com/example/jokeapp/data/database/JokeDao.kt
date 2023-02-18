package com.example.jokeapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface JokeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertJoke(joke: JokeInfoDbModel)

    @Query("SELECT * FROM joke_db")
    fun getJoke(): LiveData<JokeInfoDbModel>
}