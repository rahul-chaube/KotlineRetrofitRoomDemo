package com.example.kotlineretrofit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitConf {

    var BASE_URL = "http://cloud3.escanav.com:8282/"

    val instances: RestService by lazy {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(RestService::class.java)
    }
}