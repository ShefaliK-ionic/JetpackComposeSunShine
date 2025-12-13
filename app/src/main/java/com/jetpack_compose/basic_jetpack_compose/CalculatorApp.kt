package com.jetpack_compose.basic_jetpack_compose

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType


@Composable
fun calcApp() {
    var num1 by remember {
        mutableStateOf("0")
    }

    var num2 by remember {
        mutableStateOf("0")
    }

    Column {


        TextField(
            placeholder = {Text(text = "Enter first Num")},
            value = num1,
            onValueChange = { num1=it },
            label = {Text(text = "Enter First Number")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        TextField(
            placeholder = {Text(text = "Enter second Num")},
            value = num2,
            onValueChange = {num2= it },
            label = { Text("Enter Second Number")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )

        Row {
            Button(onClick = {
                var result = num1.toInt() + num2.toInt()
//                Toast.makeText(this, "Add " + result, Toast.LENGTH_SHORT)
//                    .show()
            }) { Text(text = "Add") }

            Button(onClick = {
                var sub = num2.toInt() - num1.toInt()
//                Toast.makeText(this@MainActivity, "Subtract " + sub, Toast.LENGTH_SHORT)
//                    .show()

            }) {
                Text(text = "Sub")

            }

            Button(onClick = {
                var multiplic = num1.toInt() * num2.toInt()
//                Toast.makeText(
//                    this@MainActivity,
//                    "Multiply  " + multiplic,
//                    Toast.LENGTH_SHORT
//                ).show()

            }) { Text(text = "Multiply") }

            Button(onClick = {
                var multiplic = num1.toInt() / num2.toInt()
//                Toast.makeText(
//                    this@MainActivity,
//                    "Div  " + multiplic,
//                    Toast.LENGTH_SHORT
//                ).show()

            }) { Text(text = "Division") }

        }


    }
}