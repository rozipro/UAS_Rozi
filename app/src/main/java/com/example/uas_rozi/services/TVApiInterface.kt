package com.example.uas_rozi.services



import com.example.uas_rozi.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=6f00f727d8cf82e81b217cd083574149")
    fun getTVList(): Call<TVResponse>
}