package com.example.unsplashapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.unsplashapp.data.local.UnsplashDatabase
import com.example.unsplashapp.data.paging.UnsplashRemoteMediator
import com.example.unsplashapp.data.remote.UnsplashApi
import com.example.unsplashapp.model.UnsplashImage
import com.example.unsplashapp.util.Constants
import com.example.unsplashapp.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {


    //Our Local Database will be used as a Single source not the api
    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnsplashImage>> {

        val pagingSourceFactory = { unsplashDatabase.UnsplashImageDao().getAllImages() }


        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = unsplashApi,
                unsplashDatabase = unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow


    }
}