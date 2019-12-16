package com.example.kotlineretrofit.api

import com.example.kotlineretrofit.model.Response
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query




interface RestService {

    @GET("pkg")
    fun getAppDetails(@Query("s") action:String):Call<Response>
}