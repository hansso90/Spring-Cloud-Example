package nl.lemkes.boot.cloud.example.controller

import nl.lemkes.boot.cloud.example.service.WeatherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ThreadLocalRandom

@RestController
class WeatherAppController(
        @Autowired private val weatherService: WeatherService
)
{

    @GetMapping("/current/weather")
    fun getWeather(): String {
        return "The current weather is ${weatherService.getWeather()}"
    }
}