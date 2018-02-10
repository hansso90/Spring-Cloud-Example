package nl.lemkes.boot.cloud.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class DiscoveryServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(DiscoveryServerApplication::class.java, *args)
}


