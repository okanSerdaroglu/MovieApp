package com.okanserdaroglu.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.okanserdaroglu.movieapp.data.Model
import com.okanserdaroglu.movieapp.remote.ApiClient
import com.okanserdaroglu.movieapp.remote.ApiInterface
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    private val API_KEY = "06b4d573f01c634fd3cfd6ad69a535b6"
    private val language = "en"
    private val page = 1
    private val region = "TR"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        val apiCall = apiInterface?.getList(API_KEY,language,page,region)


        apiCall?.enqueue(object : Callback, retrofit2.Callback<Model> {
            override fun onFailure(call: Call<Model>, t: Throwable) {
                Log.e("string","string")
            }

            override fun onResponse(call: Call<Model>, response: Response<Model>) {
                Log.e("string","string")
            }

        })

    }
}

