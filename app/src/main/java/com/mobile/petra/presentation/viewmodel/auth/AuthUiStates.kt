package com.mobile.petra.presentation.viewmodel.auth

//sealed class CardActivationViewState {
//    data object Default : CardActivationViewState()
//    data object Loading : CardActivationViewState()
//    data class Success(val response: GetUserCardResponse?=null) : CardActivationViewState()
//    data class Error(val errorMessage: String?=null) : CardActivationViewState()
//}

sealed class CreateUserUiStates {
    data object Default : CreateUserUiStates()
    data object Loading : CreateUserUiStates()
    data object Success: CreateUserUiStates()
    data class Error(val errorMessage: String?=null) : CreateUserUiStates()
}

sealed class LoginUiStates {
    data object Default : LoginUiStates()
    data object Loading : LoginUiStates()
    data object Success: LoginUiStates()
    data class Error(val errorMessage: String?=null) : LoginUiStates()
}