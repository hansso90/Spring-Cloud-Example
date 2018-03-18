package nl.lemkes.boot.cloud.example.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "config-client")
class ConfigClientConfigruation {

    // can not be private because of de get en setters are missing
    lateinit var value: String
}