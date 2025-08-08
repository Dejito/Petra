package com.mobile.petra.data.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ProductResponse(
    @SerialName("id")
    val id: Int,

    @SerialName("title")
    val title: String,

    @SerialName("slug")
    val slug: String,

    @SerialName("price")
    val price: Int,

    @SerialName("description")
    val description: String,

    @SerialName("category")
    val category: Category,

    @SerialName("images")
    val images: List<String>,

    @SerialName("creationAt")
    val creationAt: String,

    @SerialName("updatedAt")
    val updatedAt: String
)

@Serializable
data class Category(
    @SerialName("id")
    val id: Int,

    @SerialName("name")
    val name: String,

    @SerialName("slug")
    val slug: String,

    @SerialName("image")
    val image: String,

    @SerialName("creationAt")
    val creationAt: String,

    @SerialName("updatedAt")
    val updatedAt: String
)


//@Serializable
//data class com.mobile.petra.data.model.response.ProductResponse(
//    @SerialName("id")
//    val id: Int,
//    @SerialName("title")
//    val title: String,
//    @SerialName("slug")
//    val slug: String,
//    @SerialName("price")
//    val price: Int,
//    @SerialName("description")
//    val description: String,
//    @SerialName("category")
//    val category: com.mobile.petra.data.model.response.Category,
////    @SerialName("images")
////    val images: String,
//)
//
//@Serializable
//data class com.mobile.petra.data.model.response.Category(
//    @SerialName("id")
//    val id: Int,
//    @SerialName("name")
//    val name: String,
//    @SerialName("image")
//    val image: String,
//    @SerialName("slug")
//    val slug: String,
//)