package nl.lemkes.boot.cloud.example.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController
{
    @Value("\${service.instance.name}")
    private lateinit var instance: String

    @RequestMapping("/")
    fun message() : String
    {
        return  "Hello from $instance";
    }
}