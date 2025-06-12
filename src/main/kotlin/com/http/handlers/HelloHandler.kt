package com.http.handlers

import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler
import java.io.OutputStream

class HelloHandler : HttpHandler {
    override fun handle(exchange: HttpExchange) {
        val response = "Hello, Kotlin!"
        exchange.sendResponseHeaders(200, response.toByteArray().size.toLong())
        exchange.responseBody.use { os: OutputStream -> os.write(response.toByteArray()) }
    }
}
