package com.jetpack_compose.typesafe_navigation.with_nav_arg_parameters

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Button(onClick = {
        val userId = 42
        navController.navigate("detail/$userId")
    }) {
        Text("Go to Detail Screen")
    }
}