package com.http

import com.http.handlers.HelloHandler
import com.sun.net.httpserver.Headers
import com.sun.net.httpserver.HttpContext
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpPrincipal
import io.mockk.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.net.InetSocketAddress
import java.net.URI

class HelloHandlerMockKTest {

    @Test
    fun `test HelloHandler response`() {
        val exchange = mockk<HttpExchange>(relaxed = true)
        val outputStream = ByteArrayOutputStream()

        every { exchange.responseBody } returns outputStream
        every { exchange.sendResponseHeaders(any(), any()) } just Runs

        val handler = HelloHandler()
        handler.handle(exchange)

        assert(outputStream.toString() == "Hello, Kotlin!")
        verify { exchange.sendResponseHeaders(200, "Hello, Kotlin!".toByteArray().size.toLong()) }
    }
    @Test
    fun response(){
        val exchange = mockk<HttpExchange>(relaxed = true)
        val outputStream = ByteArrayOutputStream()
    }
}

class CustomHttpExchange : HttpExchange() {
    override fun close() {
        TODO("Not yet implemented")
    }

    override fun getRequestURI(): URI {
        TODO("Not yet implemented")
    }

    override fun getRequestMethod(): String {
        TODO("Not yet implemented")
    }

    override fun getRequestHeaders(): Headers {
        TODO("Not yet implemented")
    }

    override fun getResponseHeaders(): Headers {
        TODO("Not yet implemented")
    }

    override fun getHttpContext(): HttpContext {
        TODO("Not yet implemented")
    }

    override fun getRequestBody(): InputStream {
        TODO("Not yet implemented")
    }

    override fun getResponseBody(): OutputStream {
        TODO("Not yet implemented")
    }

    override fun sendResponseHeaders(rCode: Int, responseLength: Long) {
        TODO("Not yet implemented")
    }

    override fun getRemoteAddress(): InetSocketAddress {
        TODO("Not yet implemented")
    }

    override fun getResponseCode(): Int {
        TODO("Not yet implemented")
    }

    override fun getLocalAddress(): InetSocketAddress {
        TODO("Not yet implemented")
    }

    override fun getProtocol(): String {
        TODO("Not yet implemented")
    }

    override fun getAttribute(name: String?): Any {
        TODO("Not yet implemented")
    }

    override fun setAttribute(name: String?, value: Any?) {
        TODO("Not yet implemented")
    }

    override fun setStreams(i: InputStream?, o: OutputStream?) {
        TODO("Not yet implemented")
    }

    override fun getPrincipal(): HttpPrincipal {
        TODO("Not yet implemented")
    }


}