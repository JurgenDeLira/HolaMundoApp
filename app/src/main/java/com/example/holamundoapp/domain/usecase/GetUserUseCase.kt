package com.example.holamundoapp.domain.usecase

import com.example.holamundoapp.data.UserRepository
import com.example.holamundoapp.domain.model.User

class GetUserUseCase(private val repository: UserRepository) {
    fun execute(): User = User(repository.getUserName())
}
