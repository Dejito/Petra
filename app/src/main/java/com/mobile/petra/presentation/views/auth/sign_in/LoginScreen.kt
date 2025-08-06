package com.mobile.petra.presentation.views.auth.sign_in

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mobile.petra.R
import com.mobile.petra.presentation.views.components.LoginScreenTextField
import com.mobile.petra.presentation.views.components.PetraBottomButton
import com.mobile.petra.presentation.views.components.PetraOutlinedTextField
import com.mobile.petra.presentation.views.components.TitleText
import com.mobile.petra.router.Navigator

@Composable
fun LoginScreen(navigator: Navigator, modifier: Modifier = Modifier) {

    val name by rememberSaveable { mutableStateOf("") }
    var pin by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }


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
                pin = pin,
                email = email,
                onPinTextChanged = { pin = it },
                onEmailTextChanged = { email = it },
                onClickedForgotPin = {},
                passwordError = ""
            )

            PetraBottomButton(
                text = "Login",
                modifier = Modifier.padding(vertical = 24.dp)
            )

            Row {
                TitleText(text = "You're new here? ")
                TitleText(
                    text = "Sign Up",
                    fontSize = 15,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {
                        navigator.navToSignUp()
                    },
                )
            }

        }
    }
}

