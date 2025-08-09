package com.mobile.petra.presentation.viewmodel.product

import com.mobile.petra.data.model.response.ProductResponse
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.remote.PetraRepository
import com.mobile.petra.data.remote.PetraRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductsViewModel(private val petraRepository: PetraRepositoryImpl): ViewModel() {

    private var _fetchProductUiState: MutableStateFlow<FetchProductUiStates> =
        MutableStateFlow(FetchProductUiStates.Default)
    val fetchProductUiState: StateFlow<FetchProductUiStates> get() = _fetchProductUiState.asStateFlow()


    private val _products = MutableStateFlow<List<ProductResponse>?>(null)
    val products: StateFlow<List<ProductResponse>?> = _products.asStateFlow()

    fun fetchProducts() {
        viewModelScope.launch(context = Dispatchers.IO) {
            _fetchProductUiState.emit(FetchProductUiStates.Loading)
            petraRepository.fetchProduct(
                onSuccess = { response ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _products.value = response
                        println("_products.value is... ${_products.value}")

                        _fetchProductUiState.emit(FetchProductUiStates.Success)
                    }
                },
                onFailure = { error ->
                    println("failed to emit............... $error")
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _fetchProductUiState.emit(FetchProductUiStates.Error(error))
                    }
                }
            )
        }
    }

}