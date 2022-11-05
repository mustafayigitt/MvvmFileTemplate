package com.mustafayigit.mvvmfiletemplate.feature.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.mustafayigit.mvvmfiletemplate.base.BaseFragment
import com.mustafayigit.mvvmfiletemplate.databinding.FragmentDashboardBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

/**
 * Created by Mustafa Yiğit on 05/11/2022
 * mustafa.yt65@gmail.com
 */

@AndroidEntryPoint
class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>() {
    override fun bindingInflater(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ): FragmentDashboardBinding =
        FragmentDashboardBinding.inflate(inflater, container, attachToParent)

    override fun getViewModelClass(): Class<DashboardViewModel> =
        DashboardViewModel::class.java

    override fun initObserver(
        binding: FragmentDashboardBinding,
        viewModel: DashboardViewModel
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {

                }
            }
        }
    }

    override fun initListener(
        binding: FragmentDashboardBinding
    ) {
        with(binding) {

        }
    }

    override fun onBindReady() {

    }

}