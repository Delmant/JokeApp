package com.example.jokeapp.data.network.model

data class FlagsDto(
    val explicit: Boolean,
    val nsfw: Boolean,
    val political: Boolean,
    val racist: Boolean,
    val religious: Boolean,
    val sexist: Boolean
)