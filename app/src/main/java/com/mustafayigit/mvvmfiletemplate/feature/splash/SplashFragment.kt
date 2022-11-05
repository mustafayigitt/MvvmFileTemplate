package com.mustafayigit.mvvmfiletemplate.feature.splash

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.mustafayigit.mvvmfiletemplate.base.BaseFragment
import com.mustafayigit.mvvmfiletemplate.databinding.FragmentSplashBinding
import com.mustafayigit.mvvmfiletemplate.feature.dashboard.DashboardViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding, DashboardViewModel>() {

    override fun bindingInflater(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ) = FragmentSplashBinding.inflate(inflater, container, attachToParent)

    override fun getViewModelClass(): Class<DashboardViewModel> = DashboardViewModel::class.java

    override fun initObserver(
        binding: FragmentSplashBinding,
        viewModel: DashboardViewModel
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {

                }
            }
        }
    }

    override fun initListener(binding: FragmentSplashBinding) {
        with(binding) {

        }
    }

    override fun onBindReady() {

        val isUserExist = arguments?.getBoolean("isUserExist") == true
        arguments?.remove("isUserExist")

        if (isUserExist.not()) {
            navigateToLogin(findNavController())
            return
        }
        navigateToDashboard(findNavController())

    }


    private fun navigateToLogin(controller: NavController) {
        val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
        controller.navigate(action)
    }

    private fun navigateToDashboard(controller: NavController) {
        val action = SplashFragmentDirections.actionSplashFragmentToDashboardFragment()
        controller.navigate(action)
    }

}