package com.mobile.petra.data.remote

import com.mobile.petra.data.local.ProductResponse
import com.mobile.petra.data.model.request.auth.CreateUserReqBody
import com.mobile.petra.data.model.request.auth.LoginReqBody


interface PetraRepository {

    suspend fun fetchProduct(
        onSuccess: (response: ProductResponse) -> Unit,
        onFailure: (error: String) -> Unit
    )

    suspend fun createUser(
        createUserReqBody: CreateUserReqBody,
        onSuccess: () -> Unit,
        onFailure: (error: String) -> Unit
    )

    suspend fun login(
        loginReqBody: LoginReqBody,
        onSuccess: () -> Unit,
        onFailure: (error: String) -> Unit
    )


}