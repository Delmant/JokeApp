package com.example.jokeapp.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "joke_db")
data class JokeInfoDbModel(
    val category: String,
    val error: Boolean,
    val flagsDto: String,
    @PrimaryKey
    val id: Int = 1,
    val joke: String,
    val lang: String,
    val safe: Boolean,
    val type: String
)