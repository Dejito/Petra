package com.mobile.petra.presentation.viewmodel.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.model.request.auth.CreateUserReqBody
import com.mobile.petra.data.remote.PetraRepository
import kotlinx.coroutines.launch

class AuthViewModel(private val petraRepository: PetraRepository) : ViewModel() {

    fun createUser(
        createUserReqBody: CreateUserReqBody,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        viewModelScope.launch {
            petraRepository.createUser(
                createUserReqBody,
                onSuccess = {

                },
                onFailure = {

                }
            )
        }
    }

}