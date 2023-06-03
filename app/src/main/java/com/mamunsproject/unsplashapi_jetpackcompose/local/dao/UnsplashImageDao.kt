package com.mamunsproject.unsplashapi_jetpackcompose.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mamunsproject.unsplashapi_jetpackcompose.model.UnsplashImage

@Dao
interface UnsplashImageDao {

    // declare all SQL queries

    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnsplashImage>)


    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()

}
