package com.opluss.myile.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.opluss.myile.R

private val DarkColorPalette = darkColors(
    primary = BurntYellow,
    primaryVariant = BurntYellow,
    secondary = BurntYellow
)

private val LightColorPalette = lightColors(
    primary = BurntYellow,
    primaryVariant = BurntYellow,
    secondary = BurntYellow

)

@Composable
fun MyIleTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors: Colors = darckThemeSelector(darkTheme)

    Scaffold(
        topBar = { topBarDefault() },
        content = {
            MaterialTheme(
                colors = colors,
                typography = Typography,
                shapes = Shapes,
                content = content
            )
        }
    )
}

@Composable
private fun darckThemeSelector(darkTheme: Boolean): Colors {
    return if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
}

@Composable
fun MyIleThemeNoActionBar(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors: Colors = darckThemeSelector(darkTheme)

    Scaffold(
        content = {
            MaterialTheme(
                colors = colors,
                typography = Typography,
                shapes = Shapes,
                content = content
            )
        }
    )
}

@Composable
private fun topBarDefault() {
    TopAppBar(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(R.drawable.logo_ile),
                modifier = Modifier.height(42.dp),
                contentDescription = "Logo",

            )
        }
        Column(Modifier.weight(8f)) {
            Text(
                text = "Meu Ilê"
            )
        }
    }
}
