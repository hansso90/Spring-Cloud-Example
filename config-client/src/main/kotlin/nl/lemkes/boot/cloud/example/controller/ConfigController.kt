package nl.lemkes.boot.cloud.example.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigController
{
    @Value("\${some.property}")
    private lateinit var property : String

    @RequestMapping("property")
    fun getProperty(): String
    {
        return property
    }
}