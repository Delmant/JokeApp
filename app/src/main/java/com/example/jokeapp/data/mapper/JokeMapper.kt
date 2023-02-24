package com.example.jokeapp.data.mapper

import com.example.jokeapp.data.database.model.JokeInfoDbModel
import com.example.jokeapp.data.network.model.JokeInfoDto
import com.example.jokeapp.domain.entity.Flags
import com.example.jokeapp.domain.entity.JokeInfo

class JokeMapper {

    fun mapDtoToDbModel(jokeInfoDto: JokeInfoDto): JokeInfoDbModel = JokeInfoDbModel(
        category = jokeInfoDto.category,
        error = jokeInfoDto.error,
        flagsDto = jokeInfoDto.flagsDto.toString(),
        id = jokeInfoDto.id,
        joke = jokeInfoDto.joke,
        lang = jokeInfoDto.lang,
        safe = jokeInfoDto.safe,
        type = jokeInfoDto.type
    )

    fun mapDbModelToEntity(jokeInfoDbModel: JokeInfoDbModel): JokeInfo {
        return JokeInfo(
            category = jokeInfoDbModel.category,
            error = jokeInfoDbModel.error,
            flagsDto = mapStringToFlags(jokeInfoDbModel.flagsDto),
            id = jokeInfoDbModel.id,
            joke = jokeInfoDbModel.joke,
            lang = jokeInfoDbModel.lang,
            safe = jokeInfoDbModel.safe,
            type = jokeInfoDbModel.type
        )
    }

    private fun mapStringToFlags(str: String): Flags {
        return Flags(
            explicit = str.split(",")[0].split("(")[1].toBoolean(),
            nsfw = str.split(",")[1].toBoolean(),
            political = str.split(",")[2].toBoolean(),
            racist = str.split(",")[3].toBoolean(),
            religious = str.split(",")[4].toBoolean(),
            sexist = str.split(",")[5].toBoolean()
        )
    }
}