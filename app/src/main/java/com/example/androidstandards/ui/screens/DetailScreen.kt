package com.example.androidstandards.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun DetailScreen(imageUrl: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        AsyncImage(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(),
            model = imageUrl,
            contentDescription = null)
    }
}

@Preview
@Composable
fun PreviewDetailScreen() {
    DetailScreen(imageUrl = "")
}
