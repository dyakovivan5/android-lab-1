package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.screens.DuplicateElementsScreen

@Composable
fun AppRoot(modifier: Modifier = Modifier) {
    DuplicateElementsScreen(modifier = modifier)
}