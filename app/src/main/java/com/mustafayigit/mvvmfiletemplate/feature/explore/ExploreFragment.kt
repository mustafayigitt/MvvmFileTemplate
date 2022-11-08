package com.mustafayigit.mvvmfiletemplate.feature.explore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.mustafayigit.mvvmfiletemplate.base.BaseFragment
import com.mustafayigit.mvvmfiletemplate.databinding.FragmentExploreBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


/**
 * Created by Mustafa Yiğit on 06/11/2022
 * mustafa.yt65@gmail.com
 */

@AndroidEntryPoint
class ExploreFragment : BaseFragment<FragmentExploreBinding, ExploreViewModel>() {

    override fun bindingInflater(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ): FragmentExploreBinding =
        FragmentExploreBinding.inflate(inflater, container, attachToParent)

    override fun getViewModelClass(): Class<ExploreViewModel> =
        ExploreViewModel::class.java

    override fun initObserver(
        binding: FragmentExploreBinding,
        viewModel: ExploreViewModel
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {

                }
            }
        }
    }

    override fun initListener(
        binding: FragmentExploreBinding
    ) {
        with(binding) {

        }
    }

    override fun onBindReady() {

    }

}