package com.mobile.petra.presentation.viewmodel.product

import com.mobile.petra.data.model.response.ProductResponse


sealed class FetchProductUiStates {
    data object Default : FetchProductUiStates()
    data object Loading : FetchProductUiStates()
    data object Success : FetchProductUiStates()
    data class Error(val errorMessage: String? = null) : FetchProductUiStates()
}
