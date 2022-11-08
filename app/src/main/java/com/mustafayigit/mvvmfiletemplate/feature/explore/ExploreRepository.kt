package com.mustafayigit.mvvmfiletemplate.feature.explore

import com.mustafayigit.mvvmfiletemplate.base.BaseRepository
import javax.inject.Inject


/**
 * Created by Mustafa Yiğit on 06/11/2022
 * mustafa.yt65@gmail.com
 */

class ExploreRepository @Inject constructor(
    private val exploreService: ExploreService
) : BaseRepository() {

}