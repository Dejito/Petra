package com.mobile.petra.presentation.viewmodel.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.model.request.auth.CreateUserReqBody
import com.mobile.petra.data.model.request.auth.LoginReqBody
import com.mobile.petra.data.remote.PetraRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel(private val petraRepository: PetraRepository) : ViewModel() {

    private var _createUserUiState: MutableStateFlow<CreateUserViewStates> =
        MutableStateFlow(CreateUserViewStates.Default)
    val createUserUiState: StateFlow<CreateUserViewStates> get() = _createUserUiState

 private var _loginUiState: MutableStateFlow<LoginUiStates> =
        MutableStateFlow(LoginUiStates.Default)
    val loginUiState: StateFlow<LoginUiStates> get() = _loginUiState


    fun createUser(
        createUserReqBody: CreateUserReqBody
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            _createUserUiState.emit(CreateUserViewStates.Loading)
            petraRepository.createUser(
                createUserReqBody,
                onSuccess = {
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _createUserUiState.emit(CreateUserViewStates.Success)
                    }
                },
                onFailure = { error ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _createUserUiState.emit(CreateUserViewStates.Error(error))
                    }
                }
            )
        }
    }

    fun login(
        loginReqBody: LoginReqBody
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            _loginUiState.emit(LoginUiStates.Loading)
            petraRepository.login(
                loginReqBody,
                onSuccess = {
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _loginUiState.emit(LoginUiStates.Success)
                    }
                },
                onFailure = { error ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _loginUiState.emit(LoginUiStates.Error(error))
                    }
                }
            )
        }
    }

    fun setCreateViewStateAsDefault() {
        viewModelScope.launch {
            _createUserUiState.emit(CreateUserViewStates.Default)
        }
    }

    fun setLoginViewStateAsDefault() {
        viewModelScope.launch {
            _loginUiState.emit(LoginUiStates.Default)
        }
    }

}