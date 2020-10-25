package com.example.challenge

data class ListResponse(
    val success : Boolean,
    val terms : String,
    val privacy: String,
    val currencies: Map<String, String>
)