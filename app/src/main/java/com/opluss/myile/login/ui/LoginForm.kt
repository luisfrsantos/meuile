package com.opluss.myile.login.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.opluss.myile.R
import com.opluss.myile.commons.ui.theme.BurntYellow
import com.opluss.myile.commons.ui.theme.MyIleThemeNoActionBar

@Composable
fun LoginForm(navController: NavHostController) {

    val nameText = remember { mutableStateOf(TextFieldValue()) }
    val phoneText = remember { mutableStateOf(TextFieldValue()) }

    MyIleThemeNoActionBar {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(bottom = 128.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.logo_ile), contentDescription = "Logo",
                Modifier
                    .padding(32.dp)
                    .size(150.dp)
            )
            OutlinedTextField(
                modifier = Modifier.padding(16.dp),
                value = nameText.value,
                onValueChange = {
                    nameText.value = it
                },
                label = { Text("Name") }


            )
            OutlinedTextField(
                modifier = Modifier.padding(bottom = 16.dp),
                value = phoneText.value,
                onValueChange = {
                    nameText.value = it
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                label = { Text("Phone") }
            )
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = BurntYellow,
                    contentColor = Color.White
                ),
                onClick = { navController.navigate("feed") }
            ) {
                Text(text = "Entrar")
            }
        }
    }
}