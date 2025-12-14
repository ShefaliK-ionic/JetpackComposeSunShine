package com.jetpack_compose.basic_jetpack_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack_compose.basic_jetpack_compose.LoginScreen
import com.jetpack_compose.basic_jetpack_compose.calcApp

@Composable
fun Navigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = ""+ Routes.screenA, builder = {

        composable(Routes.screenA){
            ScreenA(navController)
        }

        composable (Routes.screenB+"/{name}"){
            var name=it.arguments?.getString("name")
            ScreenB(name?:"No need")
        }

        composable(Routes.screenCalculator){
            calcApp()
        }

        composable(Routes.screenLogin) {
            LoginScreen()
        }


    })
}