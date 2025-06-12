package com.http;


import com.http.server.SimpleHttpServer
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


class HttpServerTest {
    private lateinit var server : SimpleHttpServer
    private var PORT : Int = 8080
    private lateinit var client: HttpClient
    @BeforeEach
    fun setUp() {
        server = SimpleHttpServer()
        server.start(PORT)
        client = HttpClient.newHttpClient()
        client  = HttpClient.newBuilder().build()
    }

    @AfterEach
    fun tearDown() {
      server.stop(0)
    }

    @Test
    fun sendRequest() {

        val request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:$PORT/hello"))
            .GET()
            .build()

       val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        println(response.body())

          println("Response Code: " + response.statusCode())
          println("Response Body: " + response.body())
    }
}