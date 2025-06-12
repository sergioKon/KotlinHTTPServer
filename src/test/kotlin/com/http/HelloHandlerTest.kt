package com.http

import com.http.handlers.HelloHandler
import com.sun.net.httpserver.HttpExchange
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.io.ByteArrayOutputStream

class HelloHandlerTest {
    @Test
    fun `test HelloHandler response`() {
        // Mock HttpExchange
        val exchange = mock(HttpExchange::class.java)

        // Mock output stream
        val outputStream = ByteArrayOutputStream()
        `when`(exchange.responseBody).thenReturn(outputStream)

        // Mock response headers
        doNothing().`when`(exchange).sendResponseHeaders(anyInt(), anyLong())

        // Call the handler
        val handler = HelloHandler()
        handler.handle(exchange)

        // Verify response
        assert(outputStream.toString() == "Hello, Kotlin!")
      //  verify(exchange).sendResponseHeaders(200, "Hello, Kotlin!".toByteArray().size.toLong())
    }
}
