package com.mobile.petra.data.model.request.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginReqBody(
    @SerialName("email")
    val email: String,
    @SerialName("password")
    val password: String
)