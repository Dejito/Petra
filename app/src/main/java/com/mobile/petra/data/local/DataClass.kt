package com.mobile.petra.data.local


data class Product (
    var title: String,
    var slug: String,
    var price: Double,
    var description: String,
    var category: Category,
    var images: List<String>,
    var isFavorite: Boolean = false,
)

data class Category (
    val id: Int,
    val name: String? = "",
    val image: String? = "",
    val slug: String? = ""
)