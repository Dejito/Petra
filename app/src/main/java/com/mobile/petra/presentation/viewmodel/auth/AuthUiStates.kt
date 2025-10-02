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

sealed class LoginEvents {
    data object Default : LoginEvents()
    data object Loading : LoginEvents()
    data object Success: LoginEvents()
    data class Error(val errorMessage: String?=null) : LoginEvents()
}


//data class LoginState(
//    val username: String = "",
//    val password: String = "",
//    val isPasswordVisible: Boolean = false,
//    val isLoading: Boolean = false,
//    val usernameError: String? = null,
//    val passwordError: String? = null,
//    val loginError: String? = null,
//) : ViewState
//
//
//sealed class LoginEvent : ViewEvent {
//    data class UserNameChanged(val username: String) : LoginEvent()
//    data class PasswordChanged(val password: String) : LoginEvent()
//    data object TogglePasswordVisibility : LoginEvent()
//    data object LoginClicked : LoginEvent()
//}