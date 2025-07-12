package com.jetpack_compose.navigation_drawer

sealed class Screen(val screen: String){
    data object Home:Screen("home")
    data object Profile:Screen("profile")
    data object Settings:Screen("settings")


}