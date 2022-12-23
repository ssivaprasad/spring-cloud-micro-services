package com.ssp.apps.book.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.book.review",
        "com.ssp.apps.crud.api.common"})
@EnableDiscoveryClient
public class BookReviewApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookReviewApplication.class, args);
    }
}
