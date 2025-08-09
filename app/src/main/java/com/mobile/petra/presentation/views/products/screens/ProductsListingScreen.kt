package com.mobile.petra.presentation.views.products.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mobile.petra.data.local.DataSource
import com.mobile.petra.presentation.viewmodel.product.ProductsViewModel
import com.mobile.petra.presentation.views.components.PetraAppBar
import com.mobile.petra.presentation.views.products.ProductItem
import com.mobile.petra.router.Navigator
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ProductListingScreen(navigator: Navigator, productsViewModel: ProductsViewModel = koinViewModel()) {
    val products = productsViewModel.products.collectAsState().value
//    val products = DataSource().loadProducts()
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
                items(products ?: emptyList()) { product ->
                    ProductItem(
                        product = product,
                        modifier = Modifier.clickable {
                            navigator.navToProductDetail()
                            productsViewModel.setProductIndex(product)
                        }
                    )
                }
            }
        }
    }
}

