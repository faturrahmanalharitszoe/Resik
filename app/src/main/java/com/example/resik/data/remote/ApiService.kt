package com.example.resik.data.remote

import com.example.resik.data.model.LoginRequest
import com.example.resik.data.model.LoginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("logout")  // atau bisa juga @GET tergantung API backend
    suspend fun logout(): Response<Unit> // atau sesuaikan dengan response dari backend
}

