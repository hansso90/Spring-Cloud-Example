package nl.lemkes.boot.cloud.example.controller

import nl.lemkes.boot.cloud.example.config.ConfigClientConfigruation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class ConfigController
{
    @Value("\${some.property}")
    private lateinit var property : String

    @Autowired
    private lateinit var config : ConfigClientConfigruation

    @RequestMapping("property")
    fun getProperty(): String
    {
        return property
    }


    @RequestMapping("config")
    fun getConfig() : String
    {
        return config.value
    }
}