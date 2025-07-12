package com.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack_compose.navigation_drawer.NavDrawer
import com.jetpack_compose.screens.WelcomeScreen
import com.jetpack_compose.screens.splashFun
import com.jetpack_compose.ui.theme.JetpackComposeSunshineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            JetpackComposeSunshineTheme {
                // A surface container using the 'background' color from the theme
NavDrawer()
//                    ColumnFun("Test")
//                rememberState()
//     ToggleExample()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeSunshineTheme {
        WelcomeScreen()
//splashFun()
//ToggleExample()
//        rememberSt/ate()

//        horizontalList()
//        lazyColumn()


       //Row function
//        rowFun()
//        spaceHorizontally()

        //Coumn function
//        ColumnFun("")
//        spacevertically()
    }
}