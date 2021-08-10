package com.example.retrofitdemo.network

import com.example.retrofitdemo.utils.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers():List<User>
}