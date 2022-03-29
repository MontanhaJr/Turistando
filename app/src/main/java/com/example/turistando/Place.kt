package com.example.turistando

data class Place(
    val idPlace: Long,
    val name: String,
    val country: String?,
    val imageUrl: String?,
    val latitude: String?,
    val longitude: String?
)