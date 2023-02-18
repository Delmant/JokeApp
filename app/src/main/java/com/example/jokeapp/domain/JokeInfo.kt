package com.example.jokeapp.domain

data class JokeInfo(
    val error: Boolean,
    val category: String,
    val type: String,
    val setup: String,
    val delivery: String,
    val flags: MutableList<Map<String, Boolean>>,
    val id: Int,
    val safe: Boolean,
    val lang: String
)