package com.opluss.myile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.opluss.myile.feed.ui.Feed
import com.opluss.myile.login.login.LoginForm

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    val navController = rememberNavController()
    navigation(navController)
}


@Composable
fun navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginForm(navController)
        }
        composable("feed") {
            Feed()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()
}
