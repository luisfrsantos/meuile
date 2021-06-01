package com.opluss.myile.commons.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.opluss.myile.R
import com.opluss.myile.commons.ui.theme.White

@Composable
fun BottomAppBar() {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = White
    ) {
        Row(
            modifier = Modifier.weight(1f).fillMaxHeight()
                .clickable { },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_home_24),
                contentDescription = "Icon"
            )
        }
        Row(
            modifier = Modifier.weight(1f).fillMaxHeight()
                .clickable { },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_shopping_cart_24),
                contentDescription = "Icon"
            )
        }
        Row(
            modifier = Modifier.weight(1f).fillMaxHeight()
                .clickable { },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_person_24),
                contentDescription = "Icon"
            )
        }
    }
}
