package com.pluu.accompanistbug

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.glide.rememberGlidePainter

private const val NumberItems = 60

@OptIn(
    ExperimentalStdlibApi::class,
    ExperimentalFoundationApi::class
)
@Composable
fun Sample() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(NumberItems) { index ->
            val painter = rememberGlidePainter(
                request = randomSampleImageUrl(index),
                fadeIn = true
            )
            Image(
                modifier = Modifier.size(600.dp),
                painter = painter,
                contentDescription = null
            )
        }
    }
}