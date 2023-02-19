package com.example.jokeapp.data.mapper

import com.example.jokeapp.data.database.model.JokeInfoDbModel
import com.example.jokeapp.data.network.model.JokeInfoDto
import com.example.jokeapp.domain.entity.JokeInfo

class JokeMapper {

    fun mapDtoToDbModel(jokeInfoDto: JokeInfoDto): JokeInfoDbModel {
        TODO()
    }

    fun mapDbModelToEntity(jokeInfoDbModel: JokeInfoDbModel): JokeInfo {
        TODO()
    }
}