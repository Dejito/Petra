package com.mobile.petra.presentation.views.products.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mobile.petra.presentation.views.components.PetraAppBar
import com.mobile.petra.router.Navigator

@Composable
fun ProductDetailScreen(navigator: Navigator) {

    val imageUrl = "https://your-image-url.com/red-hoodie.jpg" // replace with your image URL
    val painter = rememberAsyncImagePainter(imageUrl)

    Scaffold(
            topBar = { PetraAppBar(title = "Products", onClick = { navigator.navigateUp() }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color.White)
        ) {
            Image(
                painter = painter,
                contentDescription = "Product Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    DetailRow(label = "Item:", value = "Classic Red Pullover Hoodie")
                    Spacer(modifier = Modifier.height(8.dp))
                    DetailRow(label = "Amount", value = "$10.0")
                    Spacer(modifier = Modifier.height(8.dp))
                    DetailRow(label = "Category", value = "updated-category-name-ug")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Description",
                        style = MaterialTheme.typography.labelLarge,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Elevate your casual wardrobe with our Classic Red Pullover Hoodie. "
                                + "Crafted with a soft cotton blend for ultimate comfort, this vibrant red hoodie "
                                + "features a kangaroo pocket, adjustable drawstring hood, and ribbed cuffs for a snug fit. "
                                + "The timeless design ensures easy pairing with jeans or joggers for a relaxed yet stylish look, "
                                + "making it a versatile addition to your everyday attire.",
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}

@Composable
fun DetailRow(label: String, value: String) {
    Row(
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "$label ",
            style = MaterialTheme.typography.labelLarge,
            color = Color.Gray
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium
        )
    }
}
