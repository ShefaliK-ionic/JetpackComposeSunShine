package com.jetpack_compose.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jetpack_compose.navigation_drawer.Screen

sealed class BottomScreen(val screen: String){

    data object Home: BottomScreen("home")
    data object Profile: BottomScreen("profile")
    data object Search: BottomScreen("search")
    data object Notification: BottomScreen("notification")



}