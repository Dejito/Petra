package com.mobile.petra.presentation.viewmodel.product

import com.mobile.petra.data.model.response.ProductResponse
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


    private val _products: MutableStateFlow<List<ProductResponse>?> = MutableStateFlow<List<ProductResponse>?>(null)
    val products: StateFlow<List<ProductResponse>?> = _products.asStateFlow()

//    private val _businessDetails = MutableStateFlow<List<BusinessDetails>>(emptyList())
//    val businessDetails: StateFlow<List<BusinessDetails>> = _businessDetails.asStateFlow()


    fun fetchProducts() {
        viewModelScope.launch(context = Dispatchers.IO) {
            _fetchProductUiState.emit(FetchProductUiStates.Loading)
            petraRepository.fetchProduct(
                onSuccess = { response ->
                    println("successfully emitted $response")
                    viewModelScope.launch(context = Dispatchers.Main) {
                        _products.value = response
                        _fetchProductUiState.emit(FetchProductUiStates.Success(response))
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