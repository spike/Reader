package com.github.spike.bookreader.smartpickersection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun SmartPickerSection(modifier: Modifier) {
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(start = 26.dp, top = 30.dp, bottom = 8.dp)
    ){
        Column() {
            Text(text="Let our AI select a new",
                style= MaterialTheme.typography.body1)
            Text(text="book for you based on",
                style= MaterialTheme.typography.body1)
            Text(text="your interests.",
                style= MaterialTheme.typography.body1)
        }
        Column(modifier = modifier.padding(
            start = 16.dp,
            bottom = 16.dp
        )) {
            SmartPickerButton(modifier)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SmartPickerSectionDisplay() {
    ReadingTheme {
        SmartPickerSection(Modifier)
    }
}