package com.example.expense_tracking_project.screens.authentication.domain.usecase

import com.example.expense_tracking_project.screens.authentication.domain.repository.AuthRepository

class SignUpUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(
        name: String,
        email: String,
        password: String,
        confirmPassword: String
    ): Result<Unit> {
        if (password != confirmPassword) {
            return Result.failure(IllegalArgumentException("Passwords do not match"))
        }
        return repository.signUp(name, email, password)
    }
}

