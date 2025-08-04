package com.mobile.petra.presentation.viewmodel.product

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.petra.data.model.response.ProductResponse
import com.mobile.petra.data.remote.PetraRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel(private  val petraRepository: PetraRepository) : ViewModel() {

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