package com.github.spike.bookreader.stats

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.bookreader.R
import com.github.spike.bookreader.booklist.BookList
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun SummaryStats() {
        Row(
            modifier = Modifier
                .padding(
                    top = 8.dp,
                )
                .height(IntrinsicSize.Min),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier.weight(.5f))
            Card(elevation = 2.dp,
                modifier = Modifier.weight(3f),
                shape = RoundedCornerShape(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(
                            top = 20.dp,
                            bottom = 20.dp
                        )
                        .height(IntrinsicSize.Min),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally,

                        ) {
                        Text(
                            text = "996",
                            style = MaterialTheme.typography.h3,
                        )
                        Text(
                            text = "Hours",
                            style = MaterialTheme.typography.body1,
                        )

                    }

                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "207",
                            style = MaterialTheme.typography.h3,
                        )
                        Text(
                            text = "Books",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "104",
                            style = MaterialTheme.typography.h3,
                        )
                        Text(
                            text = "Authors",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.weight(.5f))
        }
    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        SummaryStats()
    }
}