package com.mobile.petra.presentation.viewmodel.product

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.local.ProductResponse
import com.mobile.petra.data.remote.PetraRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductsViewModel(private val petraRepository: PetraRepository) : ViewModel() {

    private val _products: MutableStateFlow<ProductResponse?> = MutableStateFlow(null)
    val products: StateFlow<ProductResponse?> = _products.asStateFlow()


    fun fetchProducts(
        onSuccess: (ProductResponse) -> Unit,
        onFailure: (String) -> Unit
    ){
        viewModelScope.launch(context = Dispatchers.IO) {
            petraRepository.fetchProduct(
                onSuccess, onFailure
            )
        }
    }

}