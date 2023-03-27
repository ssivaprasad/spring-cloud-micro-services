package com.ssp.apps.bankapp.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.bankapp.customers",
        "com.ssp.apps.crud.api.common"})
@EnableFeignClients
public class BankCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankCustomerApplication.class, args);
    }
}
