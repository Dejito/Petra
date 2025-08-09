package com.mobile.petra.presentation.viewmodel.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.model.request.auth.CreateUserReqBody
import com.mobile.petra.data.model.request.auth.LoginReqBody
import com.mobile.petra.data.remote.PetraRepository
import com.mobile.petra.data.remote.PetraRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AuthViewModel(private val petraRepository: PetraRepositoryImpl) : ViewModel() {

    private var _createUserUiState: MutableStateFlow<CreateUserUiStates> =
        MutableStateFlow(CreateUserUiStates.Default)
    val createUserUiState: StateFlow<CreateUserUiStates> get() = _createUserUiState.asStateFlow()


 private var _loginUiState: MutableStateFlow<LoginUiStates> =
        MutableStateFlow(LoginUiStates.Default)
    val loginUiState: StateFlow<LoginUiStates> get() = _loginUiState.asStateFlow()


    fun createUser(
        createUserReqBody: CreateUserReqBody
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            _createUserUiState.emit(CreateUserUiStates.Loading)
            petraRepository.createUser(
                createUserReqBody,
                onSuccess = {
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _createUserUiState.emit(CreateUserUiStates.Success)
                    }
                },
                onFailure = { error ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _createUserUiState.emit(CreateUserUiStates.Error(error))
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
            _createUserUiState.emit(CreateUserUiStates.Default)
        }
    }

    fun setLoginViewStateAsDefault() {
        viewModelScope.launch {
            _loginUiState.emit(LoginUiStates.Default)
        }
    }

}