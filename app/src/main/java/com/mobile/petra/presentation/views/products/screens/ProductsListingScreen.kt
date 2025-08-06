package com.mobile.petra.presentation.views.products.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mobile.petra.data.local.DataSource
import com.mobile.petra.presentation.views.components.PetraAppBar
import com.mobile.petra.presentation.views.products.ProductItem
import com.mobile.petra.router.Navigator

@Composable
fun ProductListingScreen(navigator: Navigator) {
    val products = DataSource().loadProducts()
    Scaffold(
        topBar = { PetraAppBar(title = "Products") }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 130.dp),
                contentPadding = PaddingValues(6.dp)
            ) {
                items(products){ product ->
                    ProductItem()
                }
            }
        }
    }
}

