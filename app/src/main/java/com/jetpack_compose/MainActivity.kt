package com.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack_compose.ui.theme.JetpackComposeSunshineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            JetpackComposeSunshineTheme {
                // A surface container using the 'background' color from the theme

                    ColumnFun("Test")

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeSunshineTheme {
       //Row function
        rowFun()
        spaceHorizontally()
        //Coumn function
//        ColumnFun("")
//        spacevertically()
    }
}