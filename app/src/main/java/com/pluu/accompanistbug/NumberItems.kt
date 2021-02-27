package com.pluu.accompanistbug

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import dev.chrisbanes.accompanist.glide.GlideImage

private const val NumberItems = 60

@OptIn(
    ExperimentalStdlibApi::class,
    ExperimentalFoundationApi::class
)
@Composable
fun Sample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(R.string.app_name))
                }
            )
        }
    ) {
        LazyVerticalGrid(cells = GridCells.Fixed(2)) {
            items(NumberItems) { index ->
                GlideImage(
                    data = randomSampleImageUrl(index),
                    contentDescription = null
                )
            }
        }
    }
}