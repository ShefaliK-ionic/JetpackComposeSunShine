package com.jetpack_compose.typesafe_navigation.with_parameters

import android.os.Build
import android.os.Parcelable
import androidx.navigation.NavType
import androidx.savedstate.SavedState
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer
import kotlinx.serialization.json.Json

sealed interface DestRouteWithParam{

    @Serializable
    data object ScreenC_UI: DestRouteWithParam


    //with primitive
    @Serializable
    data class ScreenD_UI(val age: Int?, val name: String): DestRouteWithParam

    //with custom object
    @Serializable
    data class ScreenE_UI(val dummy: Dummy?): DestRouteWithParam
}

//to send custom object
@Serializable
@Parcelize
data class Dummy(
    val name: String,

    val age: Int
): Parcelable


class CustomNavType<T: Parcelable>(
    private val clazz: Class<T>,
    private val serializer: KSerializer<T>
): NavType<T?>(isNullableAllowed = true) {

    companion object{
        const val NULL ="null"
    }

    override fun get(bundle: SavedState, key: String): T? {
        return  if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
           bundle.getParcelable(key,clazz)
       }else{ bundle.getParcelable(key)}

    }

    override fun parseValue(value: String): T? {
        return if(value == NULL) null else Json.decodeFromString(serializer,value)
    }

    override fun put(bundle: SavedState, key: String, value: T?) {
       bundle.putParcelable(key,value)
    }

    override fun serializeAsValue(value: T?): String {
       return value?.let { Json.encodeToString(serializer,it) }?:NULL
    }
}
