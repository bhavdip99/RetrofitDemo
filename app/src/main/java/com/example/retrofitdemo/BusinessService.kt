package com.example.retrofitdemo

import retrofit2.Call
import retrofit2.http.GET

interface BusinessService {

    @GET("businesses")
    fun getBusinesses(): Call<List<Business>>
}