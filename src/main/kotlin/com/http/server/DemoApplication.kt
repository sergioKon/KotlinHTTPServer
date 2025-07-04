package  com.http.server



import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = ["com.http.controllers"])
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)

}

