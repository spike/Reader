package com.github.spike.bookreader.booklist

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.bookreader.bottomnavigation.BottomNavigationBar
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun DrawPercentageIndicator(percentage: Int) {
    val angle: Float = -(percentage * 360f) / 100f
    Canvas(modifier = Modifier.size(24.dp)) {
        drawCircle(
            color = Color.Black,
            center = center,
            radius = 30.dp.toPx()
        )
        drawArc(
            Color.White,
            startAngle = -90f,
            sweepAngle = angle,
            useCenter = true,
            size = Size(24.dp.toPx(), 24.dp.toPx()),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewIndicator() {
    ReadingTheme {
        DrawPercentageIndicator(percentage = 85)
    }
}