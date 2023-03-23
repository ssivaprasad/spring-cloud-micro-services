package com.ssp.apps.bankapp.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.bankapp.customers",
        "com.ssp.apps.crud.api.common"})
public class BankCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankCustomerApplication.class, args);
    }
}
