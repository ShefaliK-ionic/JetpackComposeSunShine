package com.jetpack_compose.typesafe_navigation

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack_compose.ui.theme.JetpackComposeSunshineTheme
import kotlinx.serialization.Serializable

@Composable
fun typeSafeNavigate(modifier: Modifier = Modifier) {

    JetpackComposeSunshineTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            innerPadding->
//            modifier= Modifier.padding(innerPadding)
          val navController= rememberNavController()
            NavHost(navController= navController, startDestination = DestRoutes.ScreenA){

                composable <DestRoutes.ScreenA>{
                    ScreenA_UI {
                        Log.d("222", "typeSafeNavigate: ScreeA")
                        navController.navigate(DestRoutes.ScreenB) }
                }


                composable<DestRoutes.ScreenB> {

                   ScreenB_UI {
                       Log.d("222", "typeSafeNavigate: ScreeB")

                       navController.popBackStack()}
                }

            }

        }



    }
}


//sealed interface DestRoute{
//    @Serializable
//    data object ScreenA: DestRoutes
//
//    @Serializable
//    data object ScreenB_Ui: DestRoutes
//
//}

//@Composable
//fun ScreenA(modifier: Modifier = Modifier,onclick:()-> Unit) {
//
//    Box(modifier= Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//
//        Button(onClick = {onclick}) {
//            Text(text = "Click from A")
//        }
//    }
//
//
//}


//sealed interface DestRoutes{
//    @Serializable
//    data object ScreenA: DestRoutes
//
//    @Serializable
//    data object ScreenB: DestRoutes
//
//}

//@Composable
//fun ScreenA_UI(modifier: Modifier = Modifier,onclick:()-> Unit) {
//
//    Box(modifier= Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//
//        Button(onClick = {onclick}) {
//            Text(text = "Click from A")
//        }
//    }
//
//
//}

//sealed interface DestRoutes{
//    @Serializable
//    data object ScreenA: DestRoutes
//
//    @Serializable
//    data object ScreenB: DestRoutes
//
//}