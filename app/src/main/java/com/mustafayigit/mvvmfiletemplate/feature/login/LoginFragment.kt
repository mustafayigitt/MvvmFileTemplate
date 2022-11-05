package com.mustafayigit.mvvmfiletemplate.feature.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.mustafayigit.mvvmfiletemplate.base.BaseFragment
import com.mustafayigit.mvvmfiletemplate.base.ResponseWrapper
import com.mustafayigit.mvvmfiletemplate.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */
@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override fun bindingInflater(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ) = FragmentLoginBinding.inflate(inflater, container, attachToParent)

    override fun getViewModelClass(): Class<LoginViewModel> = LoginViewModel::class.java

    override fun initObserver(
        binding: FragmentLoginBinding,
        viewModel: LoginViewModel
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.loginState.collect { state ->
                        handleLoginState(state)
                    }
                }
            }
        }

    }

    override fun initListener(binding: FragmentLoginBinding) {
        with(binding) {
            btnLogin.setOnClickListener {
                val username = txtEmail.text.toString()
                val password = txtPassword.text.toString()
                mViewModel?.login(username, password)
            }
        }
    }

    override fun onBindReady() {

    }

    private fun handleLoginState(state: ResponseWrapper<Boolean>) {
        when (state) {
            is ResponseWrapper.Loading -> {
                // show progress
            }
            is ResponseWrapper.Error -> {
                // show error
            }
            is ResponseWrapper.Success -> {
                // navigate to splash
                navigateToSplash(findNavController())
            }
        }
    }

    private fun navigateToSplash(navController: NavController) {
        val action = LoginFragmentDirections.actionLoginFragmentToSplashFragment()
        navController.navigate(
            action.actionId,
            bundleOf(
                "isUserExist" to true
            )
        )
    }

}