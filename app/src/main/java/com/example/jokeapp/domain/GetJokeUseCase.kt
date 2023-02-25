package com.example.jokeapp.domain

class GetJokeUseCase(private val repository: JokeRepository) {
    operator fun invoke(id: Int) = repository.getJoke(id)
}