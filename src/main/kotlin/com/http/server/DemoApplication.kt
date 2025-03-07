package  com.http.server

import com.http.handlers.BaseHandler
import org.springframework.boot.autoconfigure.SpringBootApplication

import java.net.InetSocketAddress
import com.sun.net.httpserver.HttpServer

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	//runApplication<DemoApplication>(*args)
	val start = System.currentTimeMillis()
	val server = HttpServer.create(InetSocketAddress(8080), 0)

	server.createContext("/", BaseHandler() )



	// Start the server

	server.start()
	val duration  = System.currentTimeMillis() -start

	println("Server started at http://localhost:8080/  time =  $duration" +"ms")
}
