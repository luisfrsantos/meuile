package com.opluss.myile.feed.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.glide.rememberGlidePainter
import com.opluss.myile.R
import com.opluss.myile.commons.ui.theme.MyIleTheme
import com.opluss.myile.feed.model.News

@Composable
fun Feed(newsList: List<News>) {
    MyIleTheme(title = "Mural") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {
            newsList(newsList)
        }
    }
}

@Composable
fun newsList(newsList: List<News>) {
    newsList.forEach { news ->
        Card(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .padding(4.dp),
            elevation = 8.dp
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Image(
                        painter = painterResource(R.drawable.orixa),
                        contentDescription = "New Image"
                    )
                    Text(
                        text = "Nome do usuario",
                        modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(3f)
                        .fillMaxWidth()
                ) {
                    Image(
                        modifier = Modifier.fillMaxWidth(),
                        painter = rememberGlidePainter(news.image),
                        contentDescription = "New Image"
                    )
                }
                Row(modifier = Modifier.weight(2f)) {
                    Text(
                        text = news.content,
                        modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                        maxLines = 3
                    )

                    Text(
                        text = "Leia mais ...",
                        modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                        maxLines = 3
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(1.1f)
                        .fillMaxWidth()
                ) {

                    Column(horizontalAlignment = Alignment.Start, modifier = Modifier.weight(1f)) {
                        val selected = remember { mutableStateOf(false) }
                        val image = remember { mutableStateOf(R.drawable.ic_baseline_favorite_border_24) }
                        Image(
                            modifier = Modifier.padding(8.dp)
                                .clickable {
                                    setSelectedImage(selected, image)
                                },
                            painter = painterResource(id = image.value),
                            contentDescription = "Like",
                        )
                    }
                    Column(horizontalAlignment = Alignment.End, modifier = Modifier.weight(1f)) {

                        Text(
                            text = "Leia mais ...",
                            color = Color.Blue,
                            modifier = Modifier.padding(start = 8.dp, top = 8.dp,)
                                .clickable {
                                },
                            maxLines = 1

                        )
                    }
                }
            }
        }
    }
}

private fun setSelectedImage(selected: MutableState<Boolean>, image: MutableState<Int>) {
    selected.value = selected.value.not()
    if (selected.value) {
        image.value = R.drawable.ic_baseline_favorite_24
    } else {
        image.value = R.drawable.ic_baseline_favorite_border_24
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Feed(arrayListOf())
}
