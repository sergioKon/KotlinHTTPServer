package com.http.handlers

import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler


 class BaseHandler : HttpHandler {
    override fun handle(exchange: HttpExchange?) {
        print("*************** server started ************")
   /*     val params = exchange?.requestURI?.query
        val pair= params?.split("&")
        val map =  exchange?.requestURI?.query?.split("&")?.associate {
            val (key, value) = it.split("=")
            key to value
        } ?: emptyMap()
        println(" pair = $pair")
    */}
}