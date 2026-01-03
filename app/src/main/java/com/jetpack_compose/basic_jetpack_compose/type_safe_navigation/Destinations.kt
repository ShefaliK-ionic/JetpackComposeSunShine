package com.jetpack_compose.basic_jetpack_compose.type_safe_navigation

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavType
import androidx.savedstate.SavedState
import com.jetpack_compose.typesafe_navigation.with_parameters.CustomNavType.Companion.NULL
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer

@Serializable
object Home

@Serializable
data class Profile(val id:String,val name: String, val cart: Cart)

@Serializable
@Parcelize
data class Cart(val id: Int, val amount: Float ): Parcelable


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


