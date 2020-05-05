package com.ssp.apps.microservices.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieRatingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRatingServiceApplication.class, args);
    }

}
