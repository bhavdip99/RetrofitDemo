package com.example.retrofitdemo.repository

import com.example.retrofitdemo.network.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}