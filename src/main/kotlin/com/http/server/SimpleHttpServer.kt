package com.http.server

import com.http.handlers.BaseHandler
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

class SimpleHttpServer {
   private lateinit var  server: HttpServer
   fun start(port : Int) {
       val start = System.currentTimeMillis()
       server= HttpServer.create(InetSocketAddress(port), 0)
       server.createContext("/hello", BaseHandler())
       server.start()
       val duration = System.currentTimeMillis() - start
       println("Server started at http://localhost:8080/  time =  $duration" + "ms")
   }
   fun stop(delay : Int){
       server.stop(delay)
   }
}