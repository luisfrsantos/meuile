package com.opluss.myile.feed.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.opluss.myile.R
import com.opluss.myile.commons.ui.theme.MyIleTheme


@Composable
fun Feed() {
    MyIleTheme(title = "Mural") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {
            for (i in 1..100) {
                newsList()
             }

        }
    }
}


@Composable
fun newsList() {
    Card(modifier = Modifier
        .height(300.dp)
        .fillMaxWidth()
        .padding(4.dp)
        ,elevation = 8.dp) {
        Column(
            Modifier.fillMaxWidth()
        ) {

            Row(modifier = Modifier
                .weight(1f)
               ) {
                Image(
                    painter = painterResource(id = R.drawable.orixa),
                    contentDescription ="New Image" )
                Text(text = "Nome do usuario",
                    modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            Row(modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(id = R.drawable.orixa),
                    contentDescription ="New Image" )
            }
            Row(modifier = Modifier.weight(2f)) {
                Text(text = "Conhecido como o rei de Oyó, " +
                        "Xangô é um poderoso orixá que tem o controle sobre os raios e trovões, " +
                        "e que também expele fogo pela boca. Quando fora rei, segundo a lenda, Xangô não poupava " +
                        "esforço para conquistar outros territórios para o seu poderoso reino. Apesar de ser guerreiro e" +
                        " muito violento, fazia questão de tratar com justiça todas as questões que apareciam entre os seus súditos.",
                    modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                    maxLines = 3
                    )

                Text(text = "Leia mais ...",
                    modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                    maxLines = 3
                )
            }
            Row(modifier = Modifier
                .weight(2f)
                .fillMaxWidth()) {
                Column(horizontalAlignment = Alignment.Start, modifier = Modifier.weight(1f)) {
                    Image(
                        modifier = Modifier.padding(8.dp)
                                            .clickable {},
                        painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
                        contentDescription = "Like",
                    )
                }
                Column(horizontalAlignment = Alignment.End, modifier = Modifier.weight(1f)) {
                    Text(text = "Leia mais ...",
                        color = Color.Blue,
                        modifier = Modifier.padding(start = 8.dp, top = 8.dp,)
                                        .clickable {},
                        maxLines = 1

                    )
                }

            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Feed()
}