package com.mustafayigit.mvvmfiletemplate.feature.login.model


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */
data class LoginModel(
    val uuid: String,
    val tokenType: String,
    val accessToken: String,
    val refreshToken: String,
    val expiresIn: Int,
)
