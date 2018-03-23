package nl.lemkes.cloud.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
class ZuulGatewayApplication

fun main(args: Array<String>) {
    SpringApplication.run(ZuulGatewayApplication::class.java, *args)
}