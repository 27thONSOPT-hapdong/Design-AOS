package com.example.mindly.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MindlyServiceImpl {

    private const val BASE_URL = ""
    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service : MindlyService = retrofit.create(MindlyService::class.java)

}