package com.jetpack_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ColumnFun(s: String) {

// Text(text = "Hello $s welcome", color = Color.Green)
// Text(text = "Hello $s welcome", color = Color.Red, fontSize = 5.sp)



 Column(horizontalAlignment = Alignment.Start) {

  Text(text = "Top Left", color = Color.Green)

 }

 Column(modifier = Modifier.fillMaxWidth(),  verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {

  Text(text = "Top Center", color = Color.Green)

 }

 Column(modifier = Modifier.fillMaxWidth(),  verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.End) {

  Text(text = "Top End", color = Color.Green)

 }


 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {

  Text(text = "Left center", color = Color.Green)

 }

 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

  Text(text = "Center center", color = Color.Green)

 }

 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.End) {

  Text(text = "Right Center", color = Color.Green)

 }


 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {

  Text(text = "Bottom Center", color = Color.Green)

 }

 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.Start) {

  Text(text = "Bottom Left", color = Color.Green)

 }

 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {

  Text(text = "Bottom Right", color = Color.Green)

 }


}

@Composable
fun spacevertically(){
 Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(),  verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally) {

  Text(text = "Space Around", color = Color.Green)
  Text(text = "Space Around1", color = Color.Green)
  Text(text = "Space Around2", color = Color.Green)
  Text(text = "Space Around3", color = Color.Green)

 }


 Column(modifier = Modifier.fillMaxHeight(),  verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally) {

  Text(text = "Space Between", color = Color.Red)
  Text(text = "Space Between1", color = Color.Red)
  Text(text = "Space Between2", color = Color.Red)
  Text(text = "Space Between3", color = Color.Red)

 }

 Column(modifier = Modifier.fillMaxHeight().fillMaxWidth(),  verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.End) {

  Text(text = "Space Evenly", color = Color.Red)
  Text(text = "Space Evenly1", color = Color.Red)
  Text(text = "Space Evenly2", color = Color.Red)
  Text(text = "Space Evenly3", color = Color.Red)

 }

}
