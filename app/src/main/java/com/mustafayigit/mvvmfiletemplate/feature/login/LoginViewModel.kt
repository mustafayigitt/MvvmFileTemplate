package com.mustafayigit.mvvmfiletemplate.feature.login

import androidx.lifecycle.viewModelScope
import com.mustafayigit.mvvmfiletemplate.base.BaseViewModel
import com.mustafayigit.mvvmfiletemplate.base.ResponseWrapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel() {

    private val _loginState: MutableStateFlow<ResponseWrapper<Boolean>> =
        MutableStateFlow(ResponseWrapper.Loading)
    val loginState = _loginState.asStateFlow()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            val result = authRepository.login(email, password)
            _loginState.value = result
        }
    }
}