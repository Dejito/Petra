package com.mobile.petra.data.remote

import io.ktor.client.HttpClient
import kotlinx.serialization.json.Json

\
class PetraRepositoryImpl: PetraRepository {

    private val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
        isLenient = true
        encodeDefaults = true
    }

    private lateinit var httpClient: HttpClient

}