package com.jetpack_compose.bottom_navigation

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNav(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold(bottomBar = {

        BottomAppBar(containerColor = Color.Green) {
            IconButton(
                onClick = {selected.value= Icons.Default.Home
                          navController.navigate(BottomScreen.Home.screen){
                              popUpTo(0)
                          }

                          },
                modifier= Modifier.weight(1f))
             {
                Icon(Icons.Default.Home,contentDescription = null, modifier= Modifier.size(20.dp),
                    tint = if(selected.value== Icons.Default.Home) Color.White else Color.DarkGray)

             }

            //search
            IconButton(
                onClick = {selected.value= Icons.Default.Search
                    navController.navigate(BottomScreen.Search.screen){
                        popUpTo(0)
                    }

                },
                modifier= Modifier.weight(1f))
            {
                Icon(Icons.Default.Search,contentDescription = null, modifier= Modifier.size(20.dp),
                    tint = if(selected.value== Icons.Default.Search) Color.White else Color.DarkGray)

            }

            //

            //


            Box (modifier = Modifier.weight(1f).padding(16.dp), contentAlignment = Alignment.Center){
                FloatingActionButton(onClick = {
                    Toast.makeText(context,"Mid", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(Icons.Default.Add,contentDescription = null,
                        tint = if(selected.value== Icons.Default.Add) Color.White else Color.DarkGray)


                }
            }

            //
            //notification
            IconButton(
                onClick = {selected.value= Icons.Default.Notifications
                    navController.navigate(BottomScreen.Notification.screen){
                        popUpTo(0)
                    }

                },
                modifier= Modifier.weight(1f))
            {
                Icon(Icons.Default.Notifications,contentDescription = null, modifier= Modifier.size(20.dp),
                    tint = if(selected.value== Icons.Default.Notifications) Color.White else Color.DarkGray)

            }


            //
            //profile
            IconButton(
                onClick = {selected.value= Icons.Default.Person
                    navController.navigate(BottomScreen.Profile.screen){
                        popUpTo(0)
                    }

                },
                modifier= Modifier.weight(1f))
            {
                Icon(Icons.Default.Person,contentDescription = null, modifier= Modifier.size(20.dp),
                    tint = if(selected.value== Icons.Default.Person) Color.White else Color.DarkGray)

            }



        }

    }) {

        paddingValues ->
        NavHost(navController= navController,startDestination= BottomScreen.Home.screen,
            modifier= Modifier.padding(paddingValues)){
           composable(BottomScreen.Home.screen){HomeBottom()}
           composable(BottomScreen.Search.screen){ SearchBottom() }
           composable(BottomScreen.Profile.screen){ProfileBottom()}
           composable(BottomScreen.Notification.screen){NotificationBottom()}

        }
    }


}

