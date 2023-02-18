package com.example.jokeapp.domain

class LoadJokeUseCase(private val repository: JokeRepository) {
    operator fun invoke() = repository.loadJoke()
}