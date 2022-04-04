package com.example.turistando

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {
    @GET("/api/v1/places")
    fun getPlaces() : Call<Place>
}