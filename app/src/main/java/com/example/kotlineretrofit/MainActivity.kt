package com.example.kotlineretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kotlineretrofit.api.RestService
import com.example.kotlineretrofit.api.RetrofitConf
import com.example.kotlineretrofit.model.Response
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUserData()
    }

    fun getUserData()
    {
        RetrofitConf.instances.getAppDetails("com.intsig.camscanner").enqueue(object :Callback<Response>{
            override fun onFailure(call: Call<Response>, t: Throwable) {
                Toast.makeText(this@MainActivity,"Error is occurred ",Toast.LENGTH_LONG).show()
                Log.e("Server Response "," "+t.message)
            }

            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {

                Log.e("Test Server ","Server Response   "+ response.body()?.description)
            }

        })
    }
}
