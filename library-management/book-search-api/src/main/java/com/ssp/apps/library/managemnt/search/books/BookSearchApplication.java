package com.ssp.apps.library.managemnt.search.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookSearchApplication {
    public static void main(String[] args) {
        System.setProperty("spring.mvc.pathmatch.matching-strategy", "ant_path_matcher");
        System.setProperty("spring.h2.console.enabled", "true");
        SpringApplication.run(BookSearchApplication.class, args);
    }
}
