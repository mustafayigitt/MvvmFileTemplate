package com.mustafayigit.mvvmfiletemplate.feature.login

import com.mustafayigit.mvvmfiletemplate.feature.login.model.LoginModel
import org.json.JSONObject
import retrofit2.Response
import retrofit2.http.POST


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */
interface AuthService {

    @POST("login")
    suspend fun login(
        body: JSONObject
    ): Response<LoginModel>

}