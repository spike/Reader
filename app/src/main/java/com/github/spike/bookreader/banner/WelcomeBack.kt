package com.github.spike.bookreader.banner

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.bookreader.R
import com.github.spike.bookreader.topbar.TopBar
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun WelcomeBack() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 26.dp, top = 30.dp)
    ){
        Column() {
            Card(
            modifier = Modifier.size(60.dp),
            shape = CircleShape,
            elevation = 0.dp,

        ) {
            Image(
                painterResource(R.drawable.ai_generated_face3),
                contentDescription = "",
            )
        }
        }
        Column(modifier = Modifier.padding(
            start = 32.dp,
            bottom = 32.dp
        )) {

            Text(text="Welcome back", style = MaterialTheme.typography.h4)
            Text(text="Cindy!", style= MaterialTheme.typography.h3)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        WelcomeBack()
    }
}