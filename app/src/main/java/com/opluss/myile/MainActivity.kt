package com.opluss.myile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.opluss.myile.ui.theme.BurntYellow
import com.opluss.myile.ui.theme.MyIleThemeNoActionBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIleThemeNoActionBar {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        logInForm()
    }
}

@Composable
fun logInForm() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 128.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.logo_ile), contentDescription = "Logo", Modifier.padding(32.dp).size(150.dp))
        OutlinedTextField(
            modifier = Modifier.padding(16.dp),
            value = "",
            onValueChange = {},
            label = { Text("Name") }

        )
        OutlinedTextField(
            modifier = Modifier.padding(bottom = 16.dp),
            value = "",
            onValueChange = {},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            label = { Text("Phone") }
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = BurntYellow, contentColor = Color.White),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Entrar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()
}
