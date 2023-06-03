package com.mamunsproject.unsplashapi_jetpackcompose.di

import android.content.Context
import androidx.room.Room
import com.mamunsproject.unsplashapi_jetpackcompose.local.UnsplashDatabase
import com.mamunsproject.unsplashapi_jetpackcompose.util.Constantss.UNSPLASH_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase {
        return Room.databaseBuilder(
            context,
            UnsplashDatabase::class.java,
            UNSPLASH_DATABASE
        ).build()
    }
}