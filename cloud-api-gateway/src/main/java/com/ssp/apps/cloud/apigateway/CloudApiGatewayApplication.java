package com.ssp.apps.cloud.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApiGatewayApplication.class, args);
    }

}
