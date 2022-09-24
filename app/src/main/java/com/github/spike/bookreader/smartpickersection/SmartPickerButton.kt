package com.github.spike.bookreader.smartpickersection

import android.widget.Toast
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.github.spike.bookreader.ui.theme.orange

@Composable
fun SmartPickerButton(){
    val mContext = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(mContext,"button clicked!", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = orange
        ),
        shape = RoundedCornerShape(50),
    )

    {
        Text(text="SMART PICKER",
            color = Color.White,
            style= MaterialTheme.typography.h5)
    }
}