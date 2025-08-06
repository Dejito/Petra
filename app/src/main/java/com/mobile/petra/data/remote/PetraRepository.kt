package com.mobile.petra.data.remote

import ProductResponse
import com.mobile.petra.data.model.request.auth.CreateUserReqBody


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


}