package com.example.generalstore.ui

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape

@Composable
fun MyButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    colors:Color
) {
    Button(
        modifier=modifier.fillMaxWidth(),
        onClick = onClick,
        shape = RectangleShape,
        colors =ButtonDefaults.buttonColors(),

    ) {
        Text(text = text, color = Color.White)
    }
}