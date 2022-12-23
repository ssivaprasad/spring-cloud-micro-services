package com.ssp.apps.manage.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.manage.product",
        "com.ssp.apps.crud.api.common"})
@EnableDiscoveryClient
public class ManageProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageProductApplication.class, args);
    }
}
