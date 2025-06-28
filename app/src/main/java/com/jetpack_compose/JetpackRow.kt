package com.jetpack_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun rowFun(){

 Row ( modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Top ) {

         Text(text = "Top End", color = Color.Green)

     }

    Row ( modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top ) {

        Text(text = "Top Center", color = Color.Green)

    }

    Row ( modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Top ) {

        Text(text = "Top Start", color = Color.Green)

    }

    //center
    Row ( modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically ) {

        Text(text = "Center End", color = Color.Green)

    }

    Row ( modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically ) {

        Text(text = "Center Center", color = Color.Green)

    }

    Row ( modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically ) {

        Text(text = "Center Start", color = Color.Green)

    }

    //bottom
    Row ( modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Bottom ) {

        Text(text = "Bottom End", color = Color.Green)

    }

    Row ( modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom ) {

        Text(text = "Bottom Center", color = Color.Green)

    }

    Row ( modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Top ) {

        Text(text = "Bottom Start", color = Color.Green)

    }}



    @Composable
    fun spaceHorizontally(){
        Row (modifier = Modifier.fillMaxWidth().fillMaxHeight(),  horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.Top) {

            Text(text = "Around", color = Color.Green)
            Text(text = "Around1", color = Color.Green)
            Text(text = "Around2", color = Color.Green)
//            Text(text = "Space Around3", color = Color.Green)

        }


        Row(modifier = Modifier.fillMaxHeight().fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {

            Text(text = "Between", color = Color.Red)
            Text(text = "Between1", color = Color.Red)
            Text(text = "Between2", color = Color.Red)
//            Text(text = "Space Between3", color = Color.Red)

        }

        Row(modifier = Modifier.fillMaxHeight().fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Bottom) {

            Text(text = "Evenly", color = Color.Red)
            Text(text = "Evenly1", color = Color.Red)
            Text(text = "Evenly2", color = Color.Red)
//            Text(text = "Space Evenly3", color = Color.Red)

        }

    }






