package com.jetpack_compose.typesafe_navigation

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.jetpack_compose.typesafe_navigation.with_parameters.DestRouteWithParam
import com.jetpack_compose.typesafe_navigation.with_parameters.ScreenC_UI
import com.jetpack_compose.typesafe_navigation.with_parameters.ScreenD_UI
import com.jetpack_compose.typesafe_navigation.without_parameters.DestRoutes
import com.jetpack_compose.typesafe_navigation.without_parameters.ScreenA_UI
import com.jetpack_compose.typesafe_navigation.without_parameters.ScreenB_UI
import com.jetpack_compose.ui.theme.JetpackComposeSunshineTheme

@Composable
fun typeSafeNavigateWithoutParameters(modifier: Modifier = Modifier) {

    JetpackComposeSunshineTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            innerPadding->
//            modifier= Modifier.padding(innerPadding)
          val navController= rememberNavController()
            NavHost(navController= navController, startDestination = DestRoutes.ScreenA){

                composable <DestRoutes.ScreenA>{
                    ScreenA_UI {
                        Log.d("222", "typeSafeNavigate: ScreeA")
                        navController.navigate(DestRoutes.ScreenB)
                    }
                }


                composable<DestRoutes.ScreenB> {

                    ScreenB_UI {
                        Log.d("222", "typeSafeNavigate: ScreeB")

                        navController.popBackStack()
                    }
                }

            }

        }



    }
}



@Composable
fun typeSafeNavigateWithParameters(modifier: Modifier = Modifier) {

    JetpackComposeSunshineTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
                innerPadding->
//            modifier= Modifier.padding(innerPadding)
            val navController= rememberNavController()
            NavHost(navController= navController, startDestination = DestRouteWithParam.ScreenC_UI){

                composable <DestRouteWithParam.ScreenC_UI>{
                    ScreenC_UI() {
                        Log.d("222", "typeSafeNavigate: ScreenC")
                        navController.navigate(DestRouteWithParam.ScreenD_UI(age = 25, name = "Shriti"))
                    }
                }


                composable<DestRouteWithParam.ScreenD_UI> {
                      val age=it.toRoute<DestRouteWithParam.ScreenD_UI>().age
                      val name=it.toRoute<DestRouteWithParam.ScreenD_UI>().name
                    ScreenD_UI(age=age, name = name) {
                        Log.d("222", "typeSafeNavigate: ScreeD")

                        navController.popBackStack()
                    }
                }

            }

        }



    }
}
