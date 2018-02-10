package nl.lemkes.boot.cloud.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class DiscoveryServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(DiscoveryServiceApplication::class.java, *args)
}


