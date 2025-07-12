package com.jetpack_compose.navigation_drawer

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch


@Composable
fun header() {

    Box(modifier = Modifier.fillMaxWidth().background(color = Color.Yellow).height(150.dp)){
    Text(text = "User name")
}

}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavDrawer(modifier: Modifier = Modifier) {

    val navcontroller= rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context= LocalContext.current.applicationContext

    ModalNavigationDrawer(drawerState=drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                header()
                NavigationDrawerItem(label = { Text(text = "Home", color = Color.Red) }, selected = false,
                    icon = {
                   Icon(imageVector = Icons.Default.Home, contentDescription = null, tint = Color.Red)
                } ,onClick = {
                    coroutineScope.launch {
                        drawerState.close()
                    }
                    navcontroller.navigate(Screen.Home.screen){
                        popUpTo(0)
                    }
                    })

                NavigationDrawerItem(label = { Text(text = "Profile", color = Color.Red) }, selected = false,
                    icon = {
                        Icon(imageVector = Icons.Default.Person, contentDescription = null, tint = Color.Red)
                    } ,onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navcontroller.navigate(Screen.Profile.screen){
                            popUpTo(0)
                        }
                    })

                NavigationDrawerItem(label = { Text(text = "Settings", color = Color.Red) }, selected = false,
                    icon = {
                        Icon(imageVector = Icons.Default.Settings, contentDescription = null, tint = Color.Red)
                    } ,onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navcontroller.navigate(Screen.Settings.screen){
                            popUpTo(0)
                        }
                    })

            }
        }) {

        Scaffold (
            topBar = {
                val coroutineScope= rememberCoroutineScope()
                TopAppBar(title = { Text(text = "WhatsApp") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Green, titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    ), navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(Icons.Rounded.Menu, contentDescription = null)

                        }
                    }

                    )
            }
        ){
          NavHost(navController = navcontroller, startDestination = Screen.Home.screen){

              composable(Screen.Home.screen){ Home() }
              composable(Screen.Profile.screen){ Profile()}
              composable(Screen.Settings.screen){ Settings()}
          }
        }

    }

}