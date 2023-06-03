package com.mamunsproject.unsplashapi_jetpackcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mamunsproject.unsplashapi_jetpackcompose.util.Constantss.UNSPLASH_REMOTE_KEYS_TABLE

@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)
