#set($MODULE_NAME_LOWERCASE = $MODULE_NAME.toLowerCase())
#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}.${MODULE_NAME_LOWERCASE} #end

#set( $USER = "Mustafa Yiğit" )
#set( $EMAIL = "mustafa.yt65@gmail.com" )

/**
 * Created by ${USER} on ${DAY}/${MONTH}/${YEAR}
 * ${EMAIL}
 */

interface ${MODULE_NAME}Service {
}