package com.ssp.apps.bankapp.customers.apiclient.config;

import feign.Logger;

import com.ssp.apps.bankapp.customers.apiclient.config.logging.FeignRequestResponseLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.DefaultFeignLoggerFactory;
import org.springframework.cloud.openfeign.FeignLoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignDefaultConfiguration {

    @Autowired
    private FeignRequestResponseLogger feignLogger;

    @Bean
    public Logger.Level feignLoggerLever() {
        return Logger.Level.FULL;
    }

    @Bean
    public FeignLoggerFactory feignLoggerFactory() {
        return new DefaultFeignLoggerFactory(this.feignLogger);
    }

}
