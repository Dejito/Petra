package com.mobile.petra.data.remote

import ProductResponse


interface PetraRepository {

    suspend fun fetchProduct(
        onSuccess: (response: ProductResponse) -> Unit,
        onFailure: (error: String) -> Unit
    )

    suspend fun createUser(
        onSuccess: () -> Unit,
        onFailure: (error: String) -> Unit
    )


}