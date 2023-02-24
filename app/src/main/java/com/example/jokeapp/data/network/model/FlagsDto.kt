package com.example.jokeapp.data.network.model

import com.google.gson.annotations.SerializedName

data class FlagsDto(
    @SerializedName("explicit")
    val explicit: Boolean,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("political")
    val political: Boolean,
    @SerializedName("racist")
    val racist: Boolean,
    @SerializedName("religious")
    val religious: Boolean,
    @SerializedName("sexist")
    val sexist: Boolean
)