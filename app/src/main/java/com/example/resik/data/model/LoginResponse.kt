package com.example.resik.data.model

data class LoginResponse(
    val status: String,
    val message: String,
    val data: UserData
)

data class UserData(
    val id: Int,
    val name: String,
    val email: String
)
