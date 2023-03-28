package com.ssp.apps.feign.api.client;

import com.ssp.apps.feign.api.client.logging.FeignRequestResponseLogger;
import feign.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.DefaultFeignLoggerFactory;
import org.springframework.cloud.openfeign.FeignLoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignDefaultConfiguration {

    @Autowired
    private FeignRequestResponseLogger feignLogger;

    @Bean
    @ConditionalOnProperty(value = "enable.feign.logging", havingValue = "true")
    public Logger.Level feignLoggerLever() {
        return Logger.Level.FULL;
    }

    @Bean
    @ConditionalOnProperty(value = "enable.feign.logging", havingValue = "true")
    public FeignLoggerFactory feignLoggerFactory() {
        return new DefaultFeignLoggerFactory(this.feignLogger);
    }

}
