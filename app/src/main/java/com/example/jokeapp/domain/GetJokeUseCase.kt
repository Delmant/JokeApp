package com.example.jokeapp.domain

class GetJokeUseCase(private val repository: JokeRepository) {
    operator fun invoke(category: String) = repository.getJoke(category)
}