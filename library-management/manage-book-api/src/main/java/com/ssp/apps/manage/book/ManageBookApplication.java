package com.ssp.apps.manage.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.manage.book",
        "com.ssp.apps.crud.api.common"})
@EnableDiscoveryClient
public class ManageBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageBookApplication.class, args);
    }
}
