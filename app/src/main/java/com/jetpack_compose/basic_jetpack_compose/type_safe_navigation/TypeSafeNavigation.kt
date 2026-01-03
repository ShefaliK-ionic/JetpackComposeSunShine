package com.jetpack_compose.basic_jetpack_compose.type_safe_navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.jetpack_compose.typesafe_navigation.with_parameters.CustomNavType
import com.jetpack_compose.typesafe_navigation.with_parameters.Dummy
import kotlin.reflect.typeOf

@Composable
fun TypeSafeNavFun(modifier: Modifier = Modifier) {

    var navController= rememberNavController()
//    NavHost(navController = navController, startDestination = Profile("66","8999")) {
    NavHost(navController = navController, startDestination = Home) {

        composable<Home> {
            HomeTypeSafeFun(onNavigate = { navController.navigate(Profile(id="8","oiio", cart = Cart(1,89.89f)))})
//            HomeTypeSafeFun(onNavigate = { navController.navigate(Profile)})
        }

        composable<Profile>(
            typeMap = mapOf(typeOf<Cart>() to CustomNavType(Cart::class.java, Cart.serializer()))

//            typeMap =
//            mapOf(typeOf<Cart>() to CustomNavType<Cart>(Cart::class.java ,
//            Cart.serializer()),
//            typeOf<Cart?>() to CustomNavType<Cart>(Cart::class.java, Cart.serializer())
        ) { backStackEntry->
            val args=backStackEntry.toRoute<Profile>()
            Log.d("222", "TypeSafeNavFun: ARGS")

            ProfileTypeSafe(userid=args.id,username=args.name,cartData=args.cart,
                onBack = { navController.popBackStack()})
        }


    }


}