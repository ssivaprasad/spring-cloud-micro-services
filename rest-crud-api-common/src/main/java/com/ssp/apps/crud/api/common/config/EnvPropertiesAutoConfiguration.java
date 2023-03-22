package com.ssp.apps.crud.api.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableConfigurationProperties
public class EnvPropertiesAutoConfiguration {

    @Bean
    @RefreshScope
    @ConfigurationProperties(prefix = "health.check")
    public Map<String, String> healthCheckProperties() {
        return new HashMap<>();
    }
}
