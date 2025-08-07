package com.mobile.petra.data.local


data class Product (
    var title: String,
    var slug: String,
    var price: Double,
    var description: String,
    var category: ProdCategory,
    var images: List<String>,
    var isFavorite: Boolean = false,
)

data class ProdCategory (
    val id: Int,
    val name: String? = "",
    val image: String? = "",
    val slug: String? = ""
)