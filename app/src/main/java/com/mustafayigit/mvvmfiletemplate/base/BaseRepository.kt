package com.mustafayigit.mvvmfiletemplate.base

import org.json.JSONObject
import retrofit2.Response


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */

abstract class BaseRepository {

    suspend fun <T : Any> safeCall(action: suspend () -> Response<T>): ResponseWrapper<T> {
        return try {
            val result = action.invoke()
            when {
                result.isSuccessful -> {
                    ResponseWrapper.Success(result.body()!!)
                }
                else -> {
                    val error = result.errorBody()?.string().orEmpty()
                    val message = JSONObject(error).getString("message")
                    ResponseWrapper.Error(message)
                }
            }
        } catch (e: Exception) {
            ResponseWrapper.Error(e.message ?: "Unknown error")
        }
    }
}