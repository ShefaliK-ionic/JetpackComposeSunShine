package com.jetpack_compose.typesafe_navigation

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
fun ScreenB_UI(modifier: Modifier = Modifier,onclick:()-> Unit) {

    Box(modifier= Modifier.fillMaxSize().background(color = Color.Red), contentAlignment = Alignment.Center){

        Button(onClick = onclick) {
            Text(text = "Back to A")
        }
    }


}