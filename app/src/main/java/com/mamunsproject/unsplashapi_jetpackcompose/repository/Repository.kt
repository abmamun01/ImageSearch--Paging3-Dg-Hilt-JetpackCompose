package com.mamunsproject.unsplashapi_jetpackcompose.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.mamunsproject.unsplashapi_jetpackcompose.data.remote.UnsplashApi
import com.mamunsproject.unsplashapi_jetpackcompose.local.UnsplashDatabase
import com.mamunsproject.unsplashapi_jetpackcompose.model.UnsplashImage
import com.mamunsproject.unsplashapi_jetpackcompose.paging.UnsplashRemoteMediator
import com.mamunsproject.unsplashapi_jetpackcompose.util.Constantss.ITEMS_PER_PAGE
import java.util.concurrent.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {


    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = { unsplashDatabase.unsplashImageDao().getAllImages() }
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