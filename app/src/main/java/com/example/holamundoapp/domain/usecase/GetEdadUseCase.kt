package com.example.holamundoapp.domain.usecase

import com.example.holamundoapp.data.UserRepository

class GetEdadUseCase(private val repository: UserRepository) {
    fun execute(): Int = repository.getUserAge()
}