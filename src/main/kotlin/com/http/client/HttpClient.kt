package com.http.client

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


    fun main(args: Array<String>) {
        val client = HttpClient.newBuilder().build()

        val request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:8080/hello"))
            .header("name","hello")
            //    .timeout(Duration.ofMillis(10*1000))
            .build();

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        println(response.body())

        println("Response Code: " + response.statusCode())
        println("Response Body: " + response.body())
    }
