#set($MODULE_NAME_LOWERCASE = $MODULE_NAME.toLowerCase())
#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.${MODULE_NAME_LOWERCASE} #end

#set ($output = $PACKAGE_NAME.split('\.'))
#set ($organization = $output.get(0))
#set ($company = $output.get(1))
#set ($brand = $output.get(2))

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import ${organization}.${company}.${brand}.base.BaseFragment
import ${organization}.${company}.${brand}.databinding.Fragment${MODULE_NAME}Binding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

#set( $USER = "Mustafa Yiğit" )
#set( $EMAIL = "mustafa.yt65@gmail.com" )

/**
 * Created by ${USER} on ${DAY}/${MONTH}/${YEAR}
 * ${EMAIL}
 */

@AndroidEntryPoint
class ${MODULE_NAME}Fragment : BaseFragment<Fragment${MODULE_NAME}Binding, ${MODULE_NAME}ViewModel>() {
    
    override fun bindingInflater(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToParent: Boolean
    ): Fragment${MODULE_NAME}Binding =
        Fragment${MODULE_NAME}Binding.inflate(inflater, container, attachToParent)

    override fun getViewModelClass(): Class<${MODULE_NAME}ViewModel> =
        ${MODULE_NAME}ViewModel::class.java

    override fun initObserver(
        binding: Fragment${MODULE_NAME}Binding,
        viewModel: ${MODULE_NAME}ViewModel
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {

                }
            }
        }
    }

    override fun initListener(
        binding: Fragment${MODULE_NAME}Binding
    ) {
        with(binding) {

        }
    }

    override fun onBindReady() {

    }

}