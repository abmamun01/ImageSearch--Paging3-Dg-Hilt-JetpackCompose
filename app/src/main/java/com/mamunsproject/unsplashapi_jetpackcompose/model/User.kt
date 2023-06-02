package com.mamunsproject.unsplashapi_jetpackcompose.model

 import androidx.room.Embedded
 import kotlinx.serialization.SerialName
 import kotlinx.serialization.Serializable


@Serializable
data class User(
    @SerialName("links")
    //for room use embeded because it's a custom class
    @Embedded
    val userLinks: UserLinks,
    val userName: String
)
