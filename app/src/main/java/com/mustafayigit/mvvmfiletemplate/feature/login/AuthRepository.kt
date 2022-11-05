package com.mustafayigit.mvvmfiletemplate.feature.login

import com.mustafayigit.mvvmfiletemplate.base.BaseRepository
import com.mustafayigit.mvvmfiletemplate.base.ResponseWrapper
import com.mustafayigit.mvvmfiletemplate.feature.login.model.LoginModel
import okhttp3.ResponseBody.Companion.toResponseBody
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */
class AuthRepository @Inject constructor(
    private val authService: AuthService
) : BaseRepository() {

    suspend fun login(
        email: String, password: String
    ): ResponseWrapper<Boolean> {
        return safeCall {
            val body = JSONObject().apply {
                put("email", email)
                put("password", password)
            }
            // mock
            return@safeCall Response.success(true)

            val result = authService.login(body)
            if (result.isSuccessful) {
                val loginModel = result.body()!!
                setCredentials(loginModel)
                Response.success(true)
            } else {
                Response.error(
                    result.code(),
                    result.errorBody() ?: "Something went wrong".toResponseBody()
                )
            }
        }
    }


    fun setCredentials(loginModel: LoginModel) {
        // store credentials
    }

}