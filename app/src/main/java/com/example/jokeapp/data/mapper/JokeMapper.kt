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
            explicit = str.split(",")[0].split("(")[KEY_EXPLICIT].toBoolean(),
            nsfw = str.split(",")[KEY_NSFW].toBoolean(),
            political = str.split(",")[KEY_POLITICAL].toBoolean(),
            racist = str.split(",")[KEY_RACIST].toBoolean(),
            religious = str.split(",")[KEY_RELIGIOUS].toBoolean(),
            sexist = str.split(",")[KEY_SEXIST].toBoolean()
        )
    }

    companion object {

        private const val KEY_EXPLICIT = 1
        private const val KEY_NSFW = 1
        private const val KEY_POLITICAL = 2
        private const val KEY_RACIST = 3
        private const val KEY_RELIGIOUS = 4
        private const val KEY_SEXIST = 5
    }
}