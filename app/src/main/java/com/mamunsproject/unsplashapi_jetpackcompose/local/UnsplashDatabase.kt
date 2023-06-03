package com.mamunsproject.unsplashapi_jetpackcompose.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mamunsproject.unsplashapi_jetpackcompose.local.dao.UnsplashImageDao
import com.mamunsproject.unsplashapi_jetpackcompose.local.dao.UnsplashRemoteKeysDao
import com.mamunsproject.unsplashapi_jetpackcompose.model.UnsplashImage
import com.mamunsproject.unsplashapi_jetpackcompose.model.UnsplashRemoteKeys


@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}