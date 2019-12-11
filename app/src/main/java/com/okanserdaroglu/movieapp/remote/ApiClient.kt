package com.okanserdaroglu.movieapp.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val baseUrl = "https://api.themoviedb.org/3/movie/top_rated"
    private var retrofit: Retrofit? = null
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create()).build()

            }
            return retrofit
        }

}