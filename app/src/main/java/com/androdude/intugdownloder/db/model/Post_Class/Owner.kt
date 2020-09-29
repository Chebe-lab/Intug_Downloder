package com.androdude.intugdownloder.db.model

data class Owner(
    val id: String,
    val is_verified: Boolean,
    val profile_pic_url: String,
    val username: String
)