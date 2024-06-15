package com.example.mobilesystemy.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

val AppTypography = FontFamily(
    Font(R.font.roboto_regular),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

val titleStyle = TextStyle(
    fontFamily = AppTypography,
    fontWeight = FontWeight.Bold,
    fontSize = 24.sp
)

val bodyStyle = TextStyle(
    fontFamily = AppTypography,
    fontSize = 16.sp
)
