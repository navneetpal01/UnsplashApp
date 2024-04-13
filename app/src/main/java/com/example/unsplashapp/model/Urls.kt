package com.example.unsplashapp.model

import kotlinx.serialization.Serializable


@Serializable
data class Urls(
    val regular : String
)




//TODO If you want ti add different variable names for this property you can
/*
data class Urls(
    @SerialName("regular")
    val regular : String
)
*/
