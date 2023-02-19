package com.example.jokeapp.data.network.model

data class JokeInfoDto(
    val category: String,
    val error: Boolean,
    val flagsDto: FlagsDto,
    val id: Int,
    val joke: String,
    val lang: String,
    val safe: Boolean,
    val type: String
)