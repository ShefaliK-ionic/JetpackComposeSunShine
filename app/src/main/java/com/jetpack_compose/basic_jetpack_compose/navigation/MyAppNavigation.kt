package com.jetpack_compose.basic_jetpack_compose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.jetpack_compose.basic_jetpack_compose.LoginScreen
import com.jetpack_compose.basic_jetpack_compose.calcApp
import com.jetpack_compose.basic_jetpack_compose.type_safe_navigation.Cart
import com.jetpack_compose.basic_jetpack_compose.type_safe_navigation.Home
import com.jetpack_compose.basic_jetpack_compose.type_safe_navigation.HomeTypeSafeFun
import com.jetpack_compose.basic_jetpack_compose.type_safe_navigation.Profile
import com.jetpack_compose.basic_jetpack_compose.type_safe_navigation.ProfileTypeSafe
import com.jetpack_compose.typesafe_navigation.with_parameters.CustomNavType
import kotlin.reflect.typeOf

@Composable
fun Navigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = ""+ Routes.screenA, builder = {

        composable(Routes.screenA){
            ScreenA(navController)
        }

        composable (Routes.screenB+"/{name}"){
            var name=it.arguments?.getString("name")
            ScreenB(name?:"No need")
        }

        composable(Routes.screenCalculator){
            calcApp()
        }

        composable(Routes.screenLogin) {
            LoginScreen()
        }

        composable<Home> {
            HomeTypeSafeFun(onNavigate = { navController.navigate(Profile(id="8","oiio", cart = Cart(1,89.89f)))})
        }

        composable<Profile>(
            typeMap = mapOf(typeOf<Cart>() to CustomNavType(Cart::class.java, Cart.serializer()))) {
            backStackEntry->
            val args=backStackEntry.toRoute<Profile>()
            Log.d("222", "TypeSafeNavFun: ARGS")

            ProfileTypeSafe(userid=args.id,username=args.name,cartData=args.cart,
                onBack = { navController.popBackStack()})
        }









    })
}