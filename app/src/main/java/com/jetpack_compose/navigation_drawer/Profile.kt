package com.jetpack_compose.navigation_drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun Profile(modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxSize().background(color = Color.White)) {
        Column (modifier= Modifier.fillMaxSize().align(Alignment.Center), verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally){

            Text(text = "Profile", color = Color.Red, fontSize = 30.sp)

        }


    }

}