package com.mobile.petra.data.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseMessage(
    @SerialName("message")
    val message: String,
    @SerialName("id")
    val userId:Int?=0,
)

@Serializable
data class ResponseMessage2(
    @SerialName("id")
    val userId:Int?=0,
    @SerialName("error") //here is the difference with the one above
    val error: String
)