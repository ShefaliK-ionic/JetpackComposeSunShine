package com.jetpack_compose.basic_jetpack_compose.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.jetpack_compose.basic_jetpack_compose.calcApp

//@Preview
@Composable
fun ScreenA(navHostController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Screen A")



        Button({
            navHostController.navigate(Routes.screenLogin)
        }) {Text(text = "Login") }


        Button({
            navHostController.navigate(Routes.screenCalculator)
        }) {Text(text = "Calculator") }

        Button({
            navHostController.navigate(Routes.screenB+"/John")
        }) {
            Text(text = "Go to screen B")
        }
    }
}