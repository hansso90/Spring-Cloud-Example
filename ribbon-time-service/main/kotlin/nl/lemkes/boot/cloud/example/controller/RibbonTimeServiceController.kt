package nl.lemkes.boot.cloud.example.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class RibbonTimeServiceController(
        @Value("\${server.port}") private val port: Integer
)
{

    @GetMapping
    fun getTime() : String
    {
       return "The current time is ${LocalDateTime.now()}, answered by: $port"
    }
}