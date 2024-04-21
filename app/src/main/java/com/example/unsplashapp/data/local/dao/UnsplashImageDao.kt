package com.example.unsplashapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.unsplashapp.data.remote.UnsplashApi
import com.example.unsplashapp.model.UnsplashImage


@Dao
interface UnsplashImageDao{


    //Not only we need to paginate from our remote but we have to paginate
    // From our room Data Base

    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages() : PagingSource<Int,UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images : List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}