package nl.lemkes.boot.cloud.example.config

import org.apache.juli.logging.LogFactory
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfiguration
{
    companion object {
        private val LOG = LogFactory.getFactory().getInstance(RestTemplateConfiguration::class.java)
    }

    init {
        LOG.info("Loading RestTemplateConfiguration...")
    }

    @Bean
    @LoadBalanced
    fun restTemplate() :RestTemplate
    {
        return RestTemplate()
    }
}