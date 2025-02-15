package com.plcoding.cryptotracker.core.domain.util

import com.plcoding.cryptotracker.util.Error


enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
}