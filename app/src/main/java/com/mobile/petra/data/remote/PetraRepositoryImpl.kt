package com.mobile.petra.data.remote

import ProductResponse
import com.mobile.petra.data.model.response.ResponseMessage
import io.ktor.client.HttpClient
import io.ktor.client.network.sockets.SocketTimeoutException
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.request
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.TextContent
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class PetraRepositoryImpl : PetraRepository {

    private var baseUrl = "https://api.escuelajs.co/api/v1/"

    private val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
        isLenient = true
        encodeDefaults = true
    }

    private lateinit var httpClient: HttpClient


    private fun initHttpClient() {

        httpClient = HttpClient {
            install(DefaultRequest) {
                headers {

                }
            }
            install(Logging) {
                logger = Logger.SIMPLE
                level = LogLevel.ALL
            }
            install(HttpTimeout) {
                requestTimeoutMillis = 40000
                connectTimeoutMillis = 40000
                socketTimeoutMillis = 40000
            }
            install(ContentNegotiation) {
                json(json)
            }
        }
    }

    private fun ensureHttpClientInitialized() {
        if (!this::httpClient.isInitialized) {
            initHttpClient()
        }
    }

//    private suspend fun currentLocation(): Location? = geoLocator.currentLocationOrNull()

    private suspend inline fun <reified T : Any, reified R : Any> makeRequest(
        method: HttpMethod,
        endpoint: String,
        requestBody: R? = null,
        token: String? = TokenManager.getToken(),
        additionalHeaders: Map<String, String> = emptyMap(),
        urlParameters: Map<String, String> = emptyMap(),
        pathParameters: Map<String, String> = emptyMap(),
        onSuccess: (T) -> Unit,
        onFailure: (String) -> Unit,
        noinline onSpecialCase: (suspend (HttpResponse) -> Unit)? = null
    ) {
        try {
            ensureHttpClientInitialized()

            var resolvedEndpoint = endpoint
            pathParameters.forEach { (key, value) ->
                resolvedEndpoint = resolvedEndpoint.replace("{$key}", value)
            }

            val response: HttpResponse = httpClient.request {
                this.method = method
                url("$baseUrl$resolvedEndpoint")
                token?.let { header("Authorization", "Bearer $it") }
                additionalHeaders.forEach { (key, value) -> header(key, value) }
                urlParameters.forEach { (key, value) -> parameter(key, value) }

                requestBody?.let { body ->
                    val bodyText = json.encodeToString(body)
                    setBody(TextContent(bodyText, ContentType.Application.Json))
                }
            }
            handleResponse(response, onSuccess, onFailure, onSpecialCase)
        } catch (e: SocketTimeoutException) {
            e.printStackTrace()
            onFailure(internetErrorMessage())
        } catch (e: Exception) {
            e.printStackTrace()
            onFailure(e.message.toString())
        }
    }

    // Centralized response handler
    private suspend inline fun <reified T : Any> handleResponse(
        response: HttpResponse,
        onSuccess: (T) -> Unit,
        onFailure: (String) -> Unit,
        noinline onSpecialCase: (suspend (HttpResponse) -> Unit)? = null
    ) {
        val rawBody = response.bodyAsText()
        when (response.status) {
            HttpStatusCode.OK, HttpStatusCode.Created -> {
                    val responseObject = json.decodeFromString<T>(rawBody)
                    onSuccess(responseObject)
            }
            HttpStatusCode.Accepted -> onSpecialCase?.invoke(response)
            HttpStatusCode.TooManyRequests -> onFailure(tooManyRequestErrorMessage())
            HttpStatusCode.ServiceUnavailable -> {
                try {
                    val errorResponse = json.decodeFromString<ResponseMessage>(rawBody)
                    onFailure(errorResponse.message)
                } catch (e: Exception) {
                    onFailure(rawBody.ifEmpty { "Service unavailable, please try again later" })
                }
            }
            else -> {
                try {
                    val errorResponse = json.decodeFromString<ResponseMessage>(rawBody)
                    onFailure(errorResponse.message)
                } catch (e: Exception) {
                    onFailure("Unexpected error: ${response.status.value} - $rawBody")
                }
            }
        }
    }


    // Utility functions (unchanged)
    private fun internetErrorMessage() = "Internet connection issue"
    private fun timeOutErrorMessage() = "Request timed out"
    private fun tooManyRequestErrorMessage() = "Too many requests"


    override suspend fun fetchProduct(
        onSuccess: (response: ProductResponse) -> Unit,
        onFailure: (error: String) -> Unit
    ) {
        makeRequest<ProductResponse, Unit>(
            method = HttpMethod.Get,
            endpoint = "products",
            onSuccess = {
                onSuccess(it)
            },
            onFailure = {
                onFailure(it)
            }
        )
    }

    override suspend fun createUser(
        onSuccess: () -> Unit,
        onFailure: (error: String) -> Unit
    ) {
        makeRequest<ProductResponse, Unit>(
            method = HttpMethod.Post,
            endpoint = "users/",
            onSuccess = {
                onSuccess()
            },
            onFailure = {
                onFailure(it)
            }
        )    }

}
