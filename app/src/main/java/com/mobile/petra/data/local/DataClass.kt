package com.mobile.petra.data.local

data class Product(
    var title: String,
    var slug: String,
    var price: Double,
    var description: String,
    var category: Category,
    var images: List<String>
)

data class Category (
    const val id = 0
    val name: String? = null
    val image: String? = null
    val slug: String? = null
)


//final int id;
//final String title;
//final String slug;
//final double price;
//final String description;
//final Category category;
//final List<String> images;
//bool? isFavorite;

//data class ResetTransactionPinBody(
//    var transactionPin: String = "",
//    val confirmTransactionPin: String = "",
//    val phoneNumber: String? = "",
//    val otp: String = "",
//    val token: String = ""
//)