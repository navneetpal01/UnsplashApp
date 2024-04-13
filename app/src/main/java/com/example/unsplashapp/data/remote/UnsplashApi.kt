package com.example.unsplashapp.data.remote

import com.example.unsplashapp.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface UnsplashApi{

    @Headers("Authorization: Client-ID gUfLkcKZWX1WjT4nKItMGEVeBQDHUkWq8HDz2c-1AYE")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page : Int,
        @Query("per_page") per_page : Int
    ) : List<UnsplashImage>

    @Headers("Authorization: Client-ID gUfLkcKZWX1WjT4nKItMGEVeBQDHUkWq8HDz2c-1AYE")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page : Int,
        @Query("per_page") per_page : Int
    ) : List<UnsplashImage>


}

