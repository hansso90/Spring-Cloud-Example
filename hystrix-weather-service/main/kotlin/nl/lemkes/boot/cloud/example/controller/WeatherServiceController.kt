package nl.lemkes.boot.cloud.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ThreadLocalRandom

@RestController
class WeatherServiceController
{
    companion object {
        private val conditions = arrayOf("Sunny", "Cloudy", "Rainy", "Windy")
    }

    @GetMapping("/weather")
    fun getWeather(): String {
        return conditions[ThreadLocalRandom.current().nextInt(0, 4)]
    }
}