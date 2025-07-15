package com.jetpack_compose.mvvm

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlin.random.Random

@Composable
fun myCounterView(modifier: Modifier = Modifier,myViewModel: MyViewModel = MyViewModel()) {

//    var count by remember { mutableStateOf(0) }

    Column {
        Button(onClick = {
            myViewModel.incrementCounter()
            myViewModel.updateText("My Data ${Random(3)}")
            myViewModel.updateState("My state ${Random(4)}")

        }) {
            Text(text = "Add count")
        }
        val textValue = myViewModel.counter//normal variable
        val textValueStr  by myViewModel.text.observeAsState("")
//        val textValue by myViewModel.text.observeAsState("")

        val textValueState = myViewModel.uiState.collectAsState()//state data

        Text(text = "My total bucket list size $textValue $textValueStr $textValueState")


    }

}

//https://towardsdev.com/mastering-viewmodel-and-lifecycle-in-jetpack-compose-6bec54457b70