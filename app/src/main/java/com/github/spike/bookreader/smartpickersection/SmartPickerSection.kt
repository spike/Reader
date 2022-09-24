package com.github.spike.bookreader.smartpickersection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SmartPickerSection() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 26.dp, top = 30.dp, bottom = 8.dp)
    ){
        Column() {
            Text(text="Let our AI select a book",
                style= MaterialTheme.typography.body1)
            Text(text="for you based on your",
                style= MaterialTheme.typography.body1)
            Text(text="interests.",
                style= MaterialTheme.typography.body1)
        }
        Column(modifier = Modifier.padding(
            start = 16.dp,
            bottom = 16.dp
        )) {
            SmartPickerButton()
        }
    }
}