package com.opluss.myile.commons.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.opluss.myile.R
import com.opluss.myile.commons.ui.theme.White

@Composable
fun TopBarDefault(title: String) {
    TopAppBar(modifier = Modifier.fillMaxWidth(), backgroundColor = White) {
        Column(modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(R.drawable.logo_ile),
                modifier = Modifier.height(42.dp),
                contentDescription = "Logo",

            )
        }
        Column(
            Modifier
                .weight(8f)
                .padding(start = 4.dp)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
