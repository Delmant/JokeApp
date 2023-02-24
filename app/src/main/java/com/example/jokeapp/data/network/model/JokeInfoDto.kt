package com.example.jokeapp.data.network.model

import com.google.gson.annotations.SerializedName

data class JokeInfoDto(
    @SerializedName("category")
    val category: String,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("flagsDto")
    val flagsDto: FlagsDto,
    @SerializedName("id")
    val id: Int,
    @SerializedName("joke")
    val joke: String,
    @SerializedName("lang")
    val lang: String,
    @SerializedName("safe")
    val safe: Boolean,
    @SerializedName("type")
    val type: String
)