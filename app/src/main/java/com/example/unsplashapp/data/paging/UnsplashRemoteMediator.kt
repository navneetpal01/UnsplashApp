package com.example.unsplashapp.data.paging

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.unsplashapp.data.local.UnsplashDatabase
import com.example.unsplashapp.data.remote.UnsplashApi
import com.example.unsplashapp.model.UnsplashImage
import javax.inject.Inject


@OptIn(ExperimentalPagingApi::class)
class UnsplashRemoteMediator @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) : RemoteMediator<Int,UnsplashImage>(){
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, UnsplashImage>
    ): MediatorResult {
        TODO("Not yet implemented")
    }

}