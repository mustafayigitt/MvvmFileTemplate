package com.mustafayigit.mvvmfiletemplate.feature.explore

import com.mustafayigit.mvvmfiletemplate.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Created by Mustafa Yiğit on 06/11/2022
 * mustafa.yt65@gmail.com
 */

@HiltViewModel
class ExploreViewModel @Inject constructor(
    private val exploreRepository: ExploreRepository
) : BaseViewModel()