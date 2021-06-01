package com.opluss.myile.commons.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.opluss.myile.commons.ui.BottomAppBar
import com.opluss.myile.commons.ui.TopBarDefault

private val DarkColorPalette = darkColors(
    primary = BurntYellow,
    primaryVariant = BurntYellow,
    secondary = BurntYellow
)

private val LightColorPalette = lightColors(
    primary = BurntYellow,
    primaryVariant = White,
    secondary = BurntYellow

)

@Composable
fun MyIleTheme(title: String, darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors: Colors = darckThemeSelector(darkTheme)
    Scaffold(
        topBar = { TopBarDefault(title) },
        bottomBar = { BottomAppBar() },
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
    MaterialTheme(
        colors = darckThemeSelector(darkTheme),
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
