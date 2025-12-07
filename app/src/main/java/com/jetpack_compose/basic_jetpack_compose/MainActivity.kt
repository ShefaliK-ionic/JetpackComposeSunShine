package com.jetpack_compose.basic_jetpack_compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jetpack_compose.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


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
                        Toast.makeText(this@MainActivity, "Add " + result, Toast.LENGTH_SHORT)
                            .show()
                    }) { Text(text = "Add") }

                    Button(onClick = {
                        var sub = num2.toInt() - num1.toInt()
                        Toast.makeText(this@MainActivity, "Subtract " + sub, Toast.LENGTH_SHORT)
                            .show()

                    }) {
                        Text(text = "Sub")

                    }

                    Button(onClick = {
                        var multiplic = num1.toInt() * num2.toInt()
                        Toast.makeText(
                            this@MainActivity,
                            "Multiply  " + multiplic,
                            Toast.LENGTH_SHORT
                        ).show()

                    }) { Text(text = "Multiply") }
                }


            }




//            basicDemo()

        }
    }

    @Composable
    private fun basicDemo() {
        Column {
            Text(text = "Test")
            Text(text = "User")
            Button(onClick = {
                Toast.makeText(this@MainActivity,"Click Me", Toast.LENGTH_LONG).show()
            }) {
                Text(text = "Click me")
            }


        }
    }
}

@Composable
private fun calc() {

}
