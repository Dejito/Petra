package com.mobile.petra.presentation.views.auth.sign_up

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mobile.petra.R

@Composable
fun SignUpScreen(){
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
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
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}