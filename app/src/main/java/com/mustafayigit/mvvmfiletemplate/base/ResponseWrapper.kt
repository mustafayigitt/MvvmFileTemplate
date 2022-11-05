package com.mustafayigit.mvvmfiletemplate.base


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */

sealed class ResponseWrapper<out T : Any>(
    open val error: String? = null,
    open val data: T? = null
) {
    object Loading : ResponseWrapper<Nothing>()
    data class Error<out T : Any>(
        override val error: String
    ) : ResponseWrapper<T>(error = error)

    data class Success<out T : Any>(
        override val data: T
    ) : ResponseWrapper<T>(data = data)
}
