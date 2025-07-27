package com.jetpack_compose.typesafe_navigation.with_parameters

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenE_UI(modifier: Modifier = Modifier, dummy: Dummy?,onclick:()-> Unit) {

    Box(modifier= Modifier.fillMaxSize().background(color = Color.Green), contentAlignment = Alignment.Center){

        Button(onClick = onclick) {
            Text(text = "Reached custom, back to primitive ${dummy?.name} ${dummy?.age}")
        }
    }


}