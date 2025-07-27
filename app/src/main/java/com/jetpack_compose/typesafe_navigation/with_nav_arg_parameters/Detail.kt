package com.jetpack_compose.typesafe_navigation.with_nav_arg_parameters

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(userId: Int?) {
    Text(text = "User ID is: ${userId ?: "Unknown"}")
}