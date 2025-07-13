package com.jetpack_compose.bottom_navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun HomeBottom(modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier) {

    Box(modifier= Modifier.fillMaxSize()){
        Column(modifier= Modifier.fillMaxSize().align(Alignment.Center), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Home Btm", fontSize = 30.sp, color = Color.Green)
        }


    }


}