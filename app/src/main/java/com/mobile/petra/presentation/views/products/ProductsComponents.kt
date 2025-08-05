package com.mobile.petra.presentation.views.products

import Product
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mobile.petra.R
import com.mobile.petra.presentation.viewmodel.product.ProductsViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ProductItem(
//    product: Product,
//    onProductClick: (Product) -> Unit
) {
//    val updatedProduct by viewModel.getProductById(product.id).collectAsState(initial = product)

    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable {  }
    ) {
        Column(modifier = Modifier.background(Color.White)) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.brand_logo),
                    contentDescription = "brand_logo",
                    modifier = Modifier
                        .size(
                            width = 200.31.dp,
                            height = 120.88.dp
                        )
                        .padding(top = 30.dp)
//                        .align(Alignment.CenterHorizontally)
                )
//                AsyncImage(
//                    model = "",
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize(),
//                    placeholder = painterResource(id = R.drawable.brand_logo),
//                    error = painterResource(id = R.drawable.brand_logo)
//                )

                IconButton(
                    onClick = {
//                        viewModel.setItemAsFavorite(updatedProduct.id)
                    },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(6.dp)
                        .background(Color.Black.copy(alpha = 0.2f), shape = CircleShape)
                        .size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null,
//                        tint = if (updatedProduct.isFavorite == true) Color.Red else Color.Gray,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Column(modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 6.dp)
                .fillMaxWidth()
            ) {
                Text(
                    text = "updatedProduct.title",
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "updatedProduct.price}",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color(0xFF4CAF50), // green
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                )
            }
        }
    }
}
