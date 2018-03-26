package nl.lemkes.boot.cloud.example.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.AsyncRestTemplate
import org.springframework.web.client.RestTemplate

@RestController
class RibbonTimeController(
        @Autowired private val restTemplate: RestTemplate
)
{
    @GetMapping
    fun getTime() : String
    {
        return restTemplate.getForEntity("http://time-service", String::class.java).body
    }
}