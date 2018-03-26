package nl.lemkes.boot.cloud.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
class HystrixWeatherApplication

fun main(args: Array<String>) {
    SpringApplication.run(HystrixWeatherApplication::class.java, *args)
}

