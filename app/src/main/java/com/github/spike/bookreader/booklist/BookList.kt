package com.github.spike.bookreader.booklist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.bookreader.*
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun BookList() {
    LazyColumn (modifier = Modifier
        .padding(top = 20.dp)
        .fillMaxWidth(),
        contentPadding= PaddingValues(bottom = 40.dp)
    ) {
        item {
            Text(
                text = "Continue Reading",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(
                    start = 30.dp,
                    top = 8.dp,
                    bottom = 20.dp),
            )
        }
        items(3) { index ->
            Row(
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                    )
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {
                Card(
                    modifier = Modifier
                        .height(80.dp)
                        .padding(start = 8.dp),
                    shape = RectangleShape,
                    elevation = 0.dp
                ) {
                    Image(
                        painterResource(covers[index].first),
                        contentDescription = "",
                    )
                }
                Column(modifier = Modifier
                    .padding(
                        start = 16.dp,
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .weight(3f),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = covers[index].second,
                        style = MaterialTheme.typography.h4
                    )
                    Text(text = covers[index].third,
                        style = MaterialTheme.typography.body2
                    )
                }
                Spacer(
                    modifier = Modifier
                        .width(IntrinsicSize.Max)
                        .weight(.5f)
                )
                Column(modifier = Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp,
                        end = 32.dp
                    )
                    .weight(1f),
                    horizontalAlignment = Alignment.End
                ) {
                    Text(text = "${percentages[index]}%",
                        fontFamily = FontFamily.Default)
                    Spacer(
                        modifier = Modifier
                            .padding(top = 20.dp)
                    )
                    Card(
                        modifier = Modifier.size(24.dp),
                        shape = CircleShape,
                        elevation = 0.dp
                    ) {
                        DrawPercentageIndicator(percentages[index])
                    }
                }
            }
            Divider(
                modifier = Modifier.padding(
                    start = 28.dp,
                    end = 32.dp,
                    top = 16.dp,
                    bottom = 16.dp
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        BookList()
    }
}