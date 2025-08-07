package com.mobile.petra.presentation.viewmodel.product

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.local.ProductResponse
import com.mobile.petra.data.remote.PetraRepository
import com.mobile.petra.presentation.viewmodel.auth.CreateUserUiStates
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductsViewModel(private val petraRepository: PetraRepository) : ViewModel() {

    private var _fetchProductUiState: MutableStateFlow<FetchProductUiStates> =
        MutableStateFlow(FetchProductUiStates.Default)
    val fetchProductUiState: StateFlow<FetchProductUiStates> get() = _fetchProductUiState.asStateFlow()


    private val _products: MutableStateFlow<ProductResponse?> = MutableStateFlow(null)
    val products: StateFlow<ProductResponse?> = _products.asStateFlow()


    fun fetchProducts() {
        viewModelScope.launch(context = Dispatchers.IO) {
            _fetchProductUiState.emit(FetchProductUiStates.Loading)
            petraRepository.fetchProduct(
                onSuccess = { response ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _fetchProductUiState.emit(FetchProductUiStates.Success(response))
                    }
                },
                onFailure = { error ->
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _fetchProductUiState.emit(FetchProductUiStates.Error(error))
                    }
                }
            )
        }
    }

}