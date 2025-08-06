package com.mobile.petra.presentation.viewmodel.auth

//sealed class CardActivationViewState {
//    data object Default : CardActivationViewState()
//    data object Loading : CardActivationViewState()
//    data class Success(val response: GetUserCardResponse?=null) : CardActivationViewState()
//    data class Error(val errorMessage: String?=null) : CardActivationViewState()
//}

sealed class CreateUserViewStates {
    data object Default : CreateUserViewStates()
    data object Loading : CreateUserViewStates()
    data object Success: CreateUserViewStates()
    data class Error(val errorMessage: String?=null) : CreateUserViewStates()

}