package com.okanserdaroglu.movieapp.remote

import retrofit2.http.GET
import retrofit2.http.Query
import com.okanserdaroglu.movieapp.data.Model
import retrofit2.Call

interface ApiInterface {

    //https://api.themoviedb.org/3/movie/top_rated?api_key=06b4d573f01c634fd3cfd6ad69a535b6&language=en-US&page=1&region=TR
    @GET("top_rated")
    fun getList(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: Int,
        @Query("region") region: String
    ):Call<Model>

}