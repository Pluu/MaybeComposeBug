package com.pluu.accompanistbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.glide.rememberGlidePainter

class GlideBasicSample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccompanistSampleTheme {
                Sample()
            }
        }
    }
}

private const val NumberItems = 60

@OptIn(ExperimentalStdlibApi::class)
@Composable
private fun Sample() {
    LazyColumn {
        items(NumberItems) { index ->
            val painter = rememberGlidePainter(
                request = randomSampleImageUrl(index),
                fadeIn = true
            )
            Row(Modifier.padding(16.dp)) {
                Image(
                    modifier = Modifier.size(600.dp),
                    painter = painter,
                    contentDescription = null
                )
            }
        }
    }
}