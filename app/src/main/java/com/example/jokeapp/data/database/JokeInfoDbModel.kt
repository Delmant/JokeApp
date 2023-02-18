package com.example.jokeapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "joke_db")
data class JokeInfoDbModel(
    val error: Boolean,
    val category: String,
    val type: String,
    val setup: String,
    val delivery: String,
    val flags: String,
    @PrimaryKey
    val id: Int,
    val safe: Boolean,
    val lang: String
)