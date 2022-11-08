#set($MODULE_NAME_LOWERCASE = $MODULE_NAME.toLowerCase())
#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.${MODULE_NAME_LOWERCASE} #end

#set ($output = $PACKAGE_NAME.split('\.'))
#set ($organization = $output.get(0))
#set ($company = $output.get(1))
#set ($brand = $output.get(2))

import ${organization}.${company}.${brand}.base.BaseRepository
import javax.inject.Inject

#set( $USER = "Mustafa Yiğit" )
#set( $EMAIL = "mustafa.yt65@gmail.com" )

/**
 * Created by ${USER} on ${DAY}/${MONTH}/${YEAR}
 * ${EMAIL}
 */

class ${MODULE_NAME}Repository @Inject constructor(
    private val ${MODULE_NAME_LOWERCASE}Service: ${MODULE_NAME}Service
) : BaseRepository() {

}