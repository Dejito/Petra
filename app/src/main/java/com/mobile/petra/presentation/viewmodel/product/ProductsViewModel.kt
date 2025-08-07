package com.mobile.petra.presentation.viewmodel.product

import ProductResponse
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.remote.PetraRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductsViewModel(private val petraRepository: PetraRepository) : ViewModel() {

    private var _fetchProductUiState: MutableStateFlow<FetchProductUiStates> =
        MutableStateFlow(FetchProductUiStates.Default)
    val fetchProductUiState: StateFlow<FetchProductUiStates> get() = _fetchProductUiState.asStateFlow()


    private var _products: MutableStateFlow<List<ProductResponse>?> = MutableStateFlow(null)
    val products: StateFlow<List<ProductResponse>?> = _products.asStateFlow()


    fun fetchProducts() {
        viewModelScope.launch(context = Dispatchers.IO) {
            _fetchProductUiState.emit(FetchProductUiStates.Loading)
            petraRepository.fetchProduct(
                onSuccess = { response ->
                    print("successfully emitted $response")
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _products.value = response
                        _fetchProductUiState.emit(FetchProductUiStates.Success(response))
                    }
                },
                onFailure = { error ->
                    print("failed to emit............... $error")
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _fetchProductUiState.emit(FetchProductUiStates.Error(error))
                    }
                }
            )
        }
    }

}