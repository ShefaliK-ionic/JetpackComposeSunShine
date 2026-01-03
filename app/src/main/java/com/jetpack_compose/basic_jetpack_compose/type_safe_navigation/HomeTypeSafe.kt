package com.jetpack_compose.basic_jetpack_compose.type_safe_navigation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeTypeSafeFun(onNavigate:()-> Unit) {
    Log.d("222", "TypeSafeNavFun: HOKM")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick =
             onNavigate ) {
            Text("Send custom parameter")
        }
    }

}
