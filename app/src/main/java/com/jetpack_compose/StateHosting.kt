package com.jetpack_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

//with state hosting
@Composable
fun parentStateHost(modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") }
    TextData(modifier,text) {
        text=it
    }
}


@Composable
fun TextData(modifier: Modifier = Modifier, text:String,onTextchange:(String) -> Unit) {
    TextField(value = text, onValueChange = onTextchange,label={
          Text("Enter text")
    })
}






//without state hosting
@Composable
fun ToggleExample(modifier: Modifier = Modifier) {

    var isChecked by remember { mutableStateOf(false) }
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked =isChecked, onCheckedChange = {isChecked=it})

        Text(if(isChecked)"Checked" else "Uncheck")
    }
}


