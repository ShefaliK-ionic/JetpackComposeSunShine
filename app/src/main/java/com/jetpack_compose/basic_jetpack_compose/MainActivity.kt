package com.jetpack_compose.basic_jetpack_compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack_compose.basic_jetpack_compose.navigation.Navigation
import com.jetpack_compose.basic_jetpack_compose.navigation.Routes
import com.jetpack_compose.basic_jetpack_compose.navigation.ScreenA
import com.jetpack_compose.basic_jetpack_compose.navigation.ScreenB

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //navigation
            Navigation()


//            LoginScreen()
//            basicDemo()
//            calcApp()

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
