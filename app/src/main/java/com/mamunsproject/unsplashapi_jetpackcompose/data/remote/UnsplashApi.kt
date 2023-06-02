package com.mamunsproject.unsplashapi_jetpackcompose.data.remote

import com.mamunsproject.unsplashapi_jetpackcompose.model.UnsplashImage
import com.mamunsproject.unsplashapi_jetpackcompose.util.Constantss.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID $API_KEY")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ): List<UnsplashImage>

    
    @Headers("Authorization: Client-ID $API_KEY")
    @GET("/photos")
    suspend fun searchImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ): List<UnsplashImage>


}