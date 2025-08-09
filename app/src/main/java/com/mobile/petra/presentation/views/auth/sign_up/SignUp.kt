package com.mobile.petra.presentation.views.auth.sign_up

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mobile.petra.R
import com.mobile.petra.data.model.request.auth.CreateUserReqBody
import com.mobile.petra.presentation.viewmodel.auth.AuthViewModel
import com.mobile.petra.presentation.viewmodel.auth.CreateUserUiStates
import com.mobile.petra.presentation.views.components.LoginScreenTextField
import com.mobile.petra.presentation.views.components.PetraAppBar
import com.mobile.petra.presentation.views.components.PetraBottomButton
import com.mobile.petra.presentation.views.components.PetraOutlinedTextField
import com.mobile.petra.presentation.views.components.TitleText
import com.mobile.petra.presentation.views.components.displayToastMessage
import com.mobile.petra.router.Navigator
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SignUpScreen(
    navigator: Navigator,
    authViewModel: AuthViewModel = koinViewModel()
) {
    val context = LocalContext.current

    SignUp(navigator, authViewModel)

    when (val createUserViewStates = authViewModel.createUserUiState.collectAsState().value) {
        is CreateUserUiStates.Default -> {}

        is CreateUserUiStates.Loading -> {}

        is CreateUserUiStates.Error -> {
            context.displayToastMessage(createUserViewStates.errorMessage ?: "")
            authViewModel.setCreateViewStateAsDefault()
        }

        is CreateUserUiStates.Success -> {
            context.displayToastMessage("Account successfully created!")
            authViewModel.setCreateViewStateAsDefault()
            navigator.navigateUp()
        }
    }

}

@Composable
fun SignUp(
    navigator: Navigator,
    authViewModel: AuthViewModel
) {
    var name by rememberSaveable { mutableStateOf("deji") }
    var password by rememberSaveable { mutableStateOf("555555") }
    var email by rememberSaveable { mutableStateOf("d@gmail.com") }
    val createUserUiStates = authViewModel.createUserUiState.collectAsState().value


    Scaffold(
        topBar = {
            PetraAppBar(title = "Sign Up", onClick = {
                navigator.navigateUp()
            })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
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
                text = "Sign up now to access \n unlimited products offering",
                fontSize = 18,
                topPadding = 40,
                maxLines = 2,
                bottomPadding = 30
            )

            PetraOutlinedTextField(
                value = name,
                onTextChanged = { name = it },
                placeholderText = "Name",
                textFieldColors = TextFieldDefaults.colors().copy(
                    unfocusedContainerColor = Color.White,
                    disabledTextColor = Color.Black,
                )
            )

            LoginScreenTextField(
                pin = password,
                email = email,
                onPinTextChanged = { password = it },
                onEmailTextChanged = { email = it },
                onClickedForgotPin = {},
                passwordError = ""
            )

            PetraBottomButton(
                text = "Sign Up",
                isLoading = createUserUiStates == CreateUserUiStates.Loading,
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = {
                    val createUserReqBody = CreateUserReqBody(
                        name = "deji",
                        email = "d@gmail.com",
                        password = "555555"
                    )
                    authViewModel.createUser(createUserReqBody = createUserReqBody)
                }
            )

            Row(modifier = Modifier.padding(top = 10.dp)) {
                TitleText(text = "Already have an account? ")
                TitleText(
                    text = "Sign in",
                    fontSize = 15,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {
                        navigator.navigateUp()
                    },
                )

            }

        }
    }
}