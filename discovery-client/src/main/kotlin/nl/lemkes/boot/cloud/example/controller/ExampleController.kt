package nl.lemkes.boot.cloud.example.controller

import com.netflix.discovery.EurekaClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.ResponseExtractor

@RestController
class ExampleController
{
    @Autowired
    private lateinit var client : EurekaClient

    @Autowired
    private lateinit var restTemplateBuilder : RestTemplateBuilder

    @RequestMapping("/")
    fun callService() : String
    {
        val restTemplate = restTemplateBuilder.build();
        val instanceInfo = client.getNextServerFromEureka("discovery-service", false)
        val baseUrl = instanceInfo.homePageUrl
        return restTemplate.getForObject(baseUrl, String::class.java)
    }

}