#set($MODULE_NAME_LOWERCASE = $MODULE_NAME.toLowerCase())
#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.${MODULE_NAME_LOWERCASE} #end

#set ($output = $PACKAGE_NAME.split('\.'))
#set ($organization = $output.get(0))
#set ($company = $output.get(1))
#set ($brand = $output.get(2))

import ${organization}.${company}.${brand}.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

#set( $USER = "Mustafa Yiğit" )
#set( $EMAIL = "mustafa.yt65@gmail.com" )

/**
 * Created by ${USER} on ${DAY}/${MONTH}/${YEAR}
 * ${EMAIL}
 */

@HiltViewModel
class ${MODULE_NAME}ViewModel @Inject constructor(
    private val ${MODULE_NAME_LOWERCASE}Repository: ${MODULE_NAME}Repository
) : BaseViewModel()