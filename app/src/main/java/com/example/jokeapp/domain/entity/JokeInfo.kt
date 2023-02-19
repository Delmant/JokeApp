package com.example.jokeapp.domain.entity

data class JokeInfo(
    val category: String,
    val error: Boolean,
    val flagsDto: Flags,
    val id: Int,
    val joke: String,
    val lang: String,
    val safe: Boolean,
    val type: String
)