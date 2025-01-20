package com.example.postapp.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = Color(0xFFFF9800), // Laranja para a TopBar e BottomBar
    primaryVariant = Color(0xFFFFC947), // Variante do laranja
    secondary = Color(0xFF6200EE), // Roxo para destaques
    background = Color(0xFFF2F2F2), // Cinza claro para o fundo
    surface = Color.White, // Branco para cartões e botões
    onPrimary = Color.White, // Branco para texto sobre a cor primária
    onSecondary = Color.White, // Branco para texto sobre a cor secundária
    onBackground = Color.Black, // Preto para textos em fundo claro
    onSurface = Color.Black // Preto para textos em cartões e botões
)

@Composable
fun AppPostTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = typography,
        shapes = shapes,
        content = content
    )
}