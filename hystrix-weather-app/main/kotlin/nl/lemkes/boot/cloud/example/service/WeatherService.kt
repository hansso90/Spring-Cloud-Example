package nl.lemkes.boot.cloud.example.service

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

interface WeatherService
{
    fun getWeather() :String
}

@Service
class WeatherServiceImpl(
        @Autowired private val restTemplate: RestTemplate
) : WeatherService
{

    @HystrixCommand(fallbackMethod = "getUnknownWeather")
    override fun getWeather() :String
    {
        return restTemplate.getForEntity("http://weather-service/weather", String::class.java).body
    }

    private fun getUnknownWeather() :String
    {
        return "unknown"
    }



}