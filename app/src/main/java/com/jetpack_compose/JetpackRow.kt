package com.jetpack_compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun rowFun(){

 Row {


     Column(horizontalAlignment = Alignment.Start) {

         Text(text = "Top Left", color = Color.Green)

     }



 }


}