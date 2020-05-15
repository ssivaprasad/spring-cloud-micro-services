package com.ssp.apps.bookmyshow.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableOAuth2Sso
@EnableDiscoveryClient
@EnableFeignClients
public class BookMyShowUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowUiApplication.class, args);
    }

}
