package com.jetpack_compose.basic_jetpack_compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack_compose.basic_jetpack_compose.navigation.Navigation
import com.jetpack_compose.basic_jetpack_compose.navigation.Routes
import com.jetpack_compose.basic_jetpack_compose.navigation.ScreenA
import com.jetpack_compose.basic_jetpack_compose.navigation.ScreenB
import com.jetpack_compose.basic_jetpack_compose.type_safe_navigation.TypeSafeNavFun

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //navigation
            Navigation()
//            TypeSafeNavFun()


//            LoginScreen()
//            basicDemo()
//            calcApp()

        }
    }


    @Composable
    fun StateManagement(modifier: Modifier = Modifier) {

    }
}
