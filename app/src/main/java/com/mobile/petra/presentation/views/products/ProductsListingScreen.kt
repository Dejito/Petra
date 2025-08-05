package com.mobile.petra.presentation.views.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mobile.petra.presentation.views.components.PetraAppBar

@Composable
fun ProductListingScreen() {
    Scaffold(
        topBar = { PetraAppBar(title = "Products") }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {

        }
    }
}