package com.example.unsplashapp.di

import android.app.Application
import androidx.room.Room
import com.example.unsplashapp.data.local.UnsplashDatabase
import com.example.unsplashapp.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun providesDatabase(application: Application) : UnsplashDatabase{
        return Room.databaseBuilder(
            application,
            UnsplashDatabase::class.java,
            UNSPLASH_DATABASE
        ).build()
    }

}