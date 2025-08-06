package com.mobile.petra.data.model.request.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreateUserReqBody(
    @SerialName("name")
    val name: String,
    @SerialName("email")
    val email: String,
    @SerialName("avatar")
    val avatar: String? = "https://picsum.photos/800",
)