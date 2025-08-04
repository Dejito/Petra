package com.mobile.petra.data.remote

import com.mobile.petra.data.model.response.ProductResponse

interface PetraRepository {

    suspend fun fetchProduct(
        onSuccess: (response: ProductResponse) -> Unit,
        onFailure: (error: String) -> Unit
    )


}