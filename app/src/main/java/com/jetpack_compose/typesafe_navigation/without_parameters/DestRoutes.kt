package com.jetpack_compose.typesafe_navigation.without_parameters

import kotlinx.serialization.Serializable

sealed interface DestRoutes{
    @Serializable
    data object ScreenA: DestRoutes

    @Serializable
    data object ScreenB: DestRoutes

}