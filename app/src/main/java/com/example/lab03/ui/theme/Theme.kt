package com.example.lab03.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun Lab03Theme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        lightColorScheme() // Define los esquemas de color aquí si es necesario
    } else {
        lightColorScheme() // Define los esquemas de color aquí si es necesario
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography, // Usando la tipografía definida en Typography.kt
        content = content
    )
}
