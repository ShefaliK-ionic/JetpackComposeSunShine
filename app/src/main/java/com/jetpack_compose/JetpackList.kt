package com.jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun horizontalList(modifier:Modifier= Modifier){
LazyRow {

    items(count=9) {

        Box(modifier=Modifier.fillMaxWidth() ){

            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "",
                modifier = Modifier.background(color = Color.LightGray))
           Text(text = "Test", color = Color.Red, modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter) )

        }

    }
}

}


@Composable
fun lazyColumn(modifier: Modifier = Modifier) {
    LazyColumn {
        items(count = 40){
            index->
            Text("Item $index", modifier = Modifier.padding(8.dp))


        }


    }
}
