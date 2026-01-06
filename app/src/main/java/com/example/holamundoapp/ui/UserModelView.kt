package com.example.holamundoapp.ui
import androidx.lifecycle.ViewModel
import com.example.holamundoapp.data.UserRepository
import com.example.holamundoapp.domain.usecase.GetUserUseCase
import com.example.holamundoapp.domain.model.User
import com.example.holamundoapp.domain.usecase.GetEdadUseCase


class UserViewModel : ViewModel() {

    private val repository = UserRepository() // o UserRepositoryImpl
    private val getUserUseCase = GetUserUseCase(repository)

    private val getEdadUseCase = GetEdadUseCase(repository)

    fun getUser(): User {
        return getUserUseCase.execute()
    }
    fun getEdad(): Int = getEdadUseCase.execute()

}