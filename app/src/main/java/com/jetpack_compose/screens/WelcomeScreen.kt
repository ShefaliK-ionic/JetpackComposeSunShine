package com.jetpack_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.jetpack_compose.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {


    Column(modifier=Modifier.fillMaxSize().background(color = colorResource(R.color.white))) {

        Box(
          modifier.fillMaxSize().weight(0.5f).background(color = Color.Red)
            )




    }

}