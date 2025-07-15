package com.mobile.petra.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json


class PetraRepositoryImpl: PetraRepository {

    private val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
        isLenient = true
        encodeDefaults = true
    }

    private lateinit var httpClient: HttpClient

    private suspend fun initHttpClient() {

        httpClient = HttpClient {
            install(DefaultRequest) {
                headers {
                }
            }
//            install(Logging) {
//                logger = Logger.SIMPLE
//                level = LogLevel.ALL
//            }
            install(HttpTimeout) {
                requestTimeoutMillis = 60000
                connectTimeoutMillis = 60000
                socketTimeoutMillis = 60000
            }
            install(ContentNegotiation) {
                json(json)
            }
        }
    }

    private suspend fun ensureHttpClientInitialized() {
        if (!this::httpClient.isInitialized) {
            initHttpClient()
        }
    }

}