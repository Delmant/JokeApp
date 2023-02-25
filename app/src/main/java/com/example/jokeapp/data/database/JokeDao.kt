package com.example.jokeapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.jokeapp.data.database.model.JokeInfoDbModel

@Dao
interface JokeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertJoke(joke: JokeInfoDbModel)

    @Query("SELECT * FROM joke_db")
    fun getJoke(id: Int): LiveData<JokeInfoDbModel>
}