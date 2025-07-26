package com.jetpack_compose.typesafe_navigation.with_parameters

import kotlinx.serialization.Serializable

sealed interface DestRouteWithParam{

    @Serializable
    data object ScreenC_UI: DestRouteWithParam
    @Serializable
    data class ScreenD_UI(val age: Int, val name: String): DestRouteWithParam

}