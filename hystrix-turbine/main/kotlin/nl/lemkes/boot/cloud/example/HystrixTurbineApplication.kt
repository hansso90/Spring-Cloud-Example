package nl.lemkes.boot.cloud.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.turbine.EnableTurbine


@SpringBootApplication
@EnableTurbine
class HystrixTurbineApplication

fun main(args: Array<String>) {
    SpringApplication.run(HystrixTurbineApplication::class.java, *args)
}
