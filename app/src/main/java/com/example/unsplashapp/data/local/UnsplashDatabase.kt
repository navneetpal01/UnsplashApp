package com.example.unsplashapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unsplashapp.data.local.dao.UnsplashImageDao
import com.example.unsplashapp.data.local.dao.UnsplashRemoteKeysDao
import com.example.unsplashapp.model.UnsplashImage
import com.example.unsplashapp.model.UnsplashRemoteKeys


@Database(entities = [UnsplashImage::class , UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase(){


    abstract fun UnsplashImageDao() : UnsplashImageDao
    abstract fun UnsplashRemoteKeysDao() : UnsplashRemoteKeysDao
}