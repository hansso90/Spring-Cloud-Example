package nl.lemkes.boot.cloud.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard


@SpringBootApplication
@EnableHystrixDashboard
class HystrixDashboardApplication

fun main(args: Array<String>) {
    SpringApplication.run(HystrixDashboardApplication::class.java, *args)
}

