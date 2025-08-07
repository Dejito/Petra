package com.mobile.petra.presentation.viewmodel.product

import com.mobile.petra.data.local.ProductResponse

sealed class FetchProductUiStates {
    data object Default : FetchProductUiStates()
    data object Loading : FetchProductUiStates()
    data class Success(val products: List<ProductResponse>? = null) : FetchProductUiStates()
    data class Error(val errorMessage: String? = null) : FetchProductUiStates()
}
