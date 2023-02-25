package com.example.jokeapp.domain

class LoadJokeUseCase(private val repository: JokeRepository) {
    suspend operator fun invoke() = repository.loadJoke()
}