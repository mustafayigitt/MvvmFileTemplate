#set($MODULE_NAME_LOWERCASE = $MODULE_NAME.toLowerCase())
#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.${MODULE_NAME_LOWERCASE}.model #end

#set( $USER = "Mustafa Yiğit" )
#set( $EMAIL = "mustafa.yt65@gmail.com" )

/**
 * Created by ${USER} on ${DAY}/${MONTH}/${YEAR}
 * ${EMAIL}
 */

data class ${MODULE_NAME}Model(
    val sampleField: String
)