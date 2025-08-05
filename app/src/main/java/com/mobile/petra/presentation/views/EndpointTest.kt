package com.mobile.petra.presentation.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobile.petra.presentation.viewmodel.product.ProductsViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun EndpointTest(productViewModel: ProductsViewModel = koinViewModel()) {
    Scaffold { pad ->
        Column(modifier = Modifier.padding(pad)) {

            Text(text = "Test endpoint..",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                    println("fetching endpoint..")
                        productViewModel.fetchProducts(
                            onSuccess = {
                                println("success resp......$it")
                            },
                            onFailure = {
                                println("error resp......$it")
                            }
                        )
                    }
                    .padding(horizontal = 16.dp, vertical = 200.dp)
            )
        }
    }
}