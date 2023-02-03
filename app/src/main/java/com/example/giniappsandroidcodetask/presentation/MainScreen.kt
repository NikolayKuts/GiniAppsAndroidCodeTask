package com.example.giniappsandroidcodetask.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.giniappsandroidcodetask.ui.theme.Orange

private const val HEIGHT_SPECIAL = 150
private const val HEIGHT_REGULAR = 100

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen(viewModel: BaseMainScreenViewModel) {
    val numberStates by viewModel.data.collectAsState()

    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        cells = GridCells.Fixed(count = 3),
        horizontalArrangement = Arrangement.Center,
        contentPadding = PaddingValues(16.dp)
    ) {
        items(numberStates) { numberState ->
            val height: Dp
            val background: Color

            if (numberState.isSpecial) {
                height = HEIGHT_SPECIAL.dp
                background = Color.Red
            } else {
                height = HEIGHT_REGULAR.dp
                background = Orange
            }

            Box(
                modifier = Modifier.height(HEIGHT_SPECIAL.dp),
                contentAlignment = Alignment.Center
            ) {
                Cell(
                    number = numberState.number.toString(),
                    height = height,
                    background = background,
                )
            }
        }
    }
}

@Composable
private fun Cell(number: String, height: Dp, background: Color) {
    Card(
        modifier = Modifier
            .height(height)
            .padding(8.dp),
        backgroundColor = background,
        shape = RoundedCornerShape(16.dp),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number,
                textAlign = TextAlign.Center,
            )
        }
    }
}