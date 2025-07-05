package com.jetpack_compose

import android.util.Log
import android.widget.TextView
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

// for a `var` variable also add
import androidx.compose.runtime.setValue

// or just
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

@Composable
fun rememberState(modifier: Modifier = Modifier) {
//  var count=0//not update ui
//    var count by remember { mutableStateOf(0)  }//on configuration changes, data lost
    var count by rememberSaveable  { mutableStateOf(0)  }//on configuration changes, data no lost

    Column {
        Log.d("222", "rememberState: count initial "+count)

        Text("Count "+count)
        Button(onClick = {
            Log.d("222", "rememberState: count"+count)
            count++
        }) { Text("Increment") }


    }


}