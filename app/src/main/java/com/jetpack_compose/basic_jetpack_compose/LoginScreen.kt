package com.jetpack_compose.basic_jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack_compose.R

@Preview
@Composable
fun LoginScreen(){

    var email by rememberSaveable {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var showPassword by remember { mutableStateOf(value = false) }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = painterResource(R.drawable.img_plant), "Login screen", modifier = Modifier.size(150.dp))
        Text(text = "Welcome back", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Login to your account")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = ""+email, onValueChange = {email=it}, label = {Text(text = "Email address")}, keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email))
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = ""+password, onValueChange = {password=it}, label = {Text(text = "Password")}, visualTransformation = if (showPassword) {

            VisualTransformation.None

        } else {

            PasswordVisualTransformation()

        },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            trailingIcon =  { IconButton(onClick = { showPassword = !showPassword }) {
                Icon(imageVector = if(showPassword) Icons.Filled.VisibilityOff else Icons.Filled.Visibility, contentDescription = "Show Password")
            }})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}){
            Text(text="Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        TextButton({}) { Text(text = "Forgot password")}
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "or signin with", modifier = Modifier.clickable{

      })


        Row(modifier = Modifier.fillMaxWidth().padding(40.dp), horizontalArrangement = Arrangement.SpaceEvenly){

            Image(painter = painterResource(R.drawable.twitter), contentDescription = "Twitter", modifier = Modifier.size(40.dp).clickable{

            })
            Image(painter = painterResource(R.drawable.facebook), contentDescription = "facebook", modifier = Modifier.size(40.dp).clickable{})
            Image(painter = painterResource(R.drawable.google), contentDescription = "google", modifier = Modifier.size(40.dp).clickable{})


        }


    }

}