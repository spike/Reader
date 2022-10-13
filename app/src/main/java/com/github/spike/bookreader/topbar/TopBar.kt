package com.github.spike.bookreader.topbar

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.github.spike.bookreader.R
import com.github.spike.bookreader.booklist.BookList
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun TopBar(modifier: Modifier) {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        TopBar(Modifier)
    }
}