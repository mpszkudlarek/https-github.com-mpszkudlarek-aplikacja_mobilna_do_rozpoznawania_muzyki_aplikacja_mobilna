package com.example.mobilesystemy.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable



private val AppColorPalette = lightColorScheme(
    primary = Purple500,
    secondary = Teal200
)

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = AppColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
