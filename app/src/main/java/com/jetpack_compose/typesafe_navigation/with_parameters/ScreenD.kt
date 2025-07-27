package com.jetpack_compose.typesafe_navigation.with_parameters

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ScreenD_UI(modifier: Modifier = Modifier,age: Int, name:String,onclick:()-> Unit) {

    Box(modifier= Modifier.fillMaxSize().background(color = Color.Red), contentAlignment = Alignment.Center){



        Button(onClick = onclick) {

            Column {
               Text("age ->$age name->$name")
                Spacer(Modifier.height(12.dp))
                Text(text = "Go to Custom")
            }

        }
    }


}