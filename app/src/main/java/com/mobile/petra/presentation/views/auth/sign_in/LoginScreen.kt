package com.mobile.petra.presentation.views.auth.sign_in

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mobile.petra.R
import com.mobile.petra.presentation.views.components.LoginScreenTextField
import com.mobile.petra.presentation.views.components.PetraOutlinedTextField
import com.mobile.petra.presentation.views.components.TitleText

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Scaffold { paddingValues ->
        Column(
            modifier = modifier
                .padding(paddingValues)
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

            TitleText(
                text = "Log In",
                fontSize = 28,
                fontWeight = FontWeight.W500,
                topPadding = 20
            )
            TitleText(
                text = "Log in now to access our \n diverse product offerings",
                fontSize = 18,
                topPadding = 40,
                maxLines = 2
            )


            LoginScreenTextField(
                pin = "",
                onPinTextChanged = {},
                onClickPinTextField = {},
                onClickedForgotPin = {},
                passwordError = ""
            )

        }
    }
}

