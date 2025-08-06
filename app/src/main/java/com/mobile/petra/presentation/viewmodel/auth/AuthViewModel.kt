package com.mobile.petra.presentation.viewmodel.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.model.request.auth.CreateUserReqBody
import com.mobile.petra.data.remote.PetraRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel(private val petraRepository: PetraRepository) : ViewModel() {

    private var _createUserState: MutableStateFlow<CreateUserViewStates> =
        MutableStateFlow(CreateUserViewStates.Default)

    val cardRequestState: StateFlow<CreateUserViewStates> get() = _createUserState


    fun createUser(
        createUserReqBody: CreateUserReqBody
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            _createUserState.emit(CreateUserViewStates.Loading)
            petraRepository.createUser(
                createUserReqBody,
                onSuccess = {
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _createUserState.emit(CreateUserViewStates.Success)
                    }
                },
                onFailure = { error ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _createUserState.emit(CreateUserViewStates.Error(error))
                    }
                }
            )
        }
    }

    fun setViewStateAsDefault() {
        viewModelScope.launch {
            _createUserState.emit(CreateUserViewStates.Default)
        }
    }

}