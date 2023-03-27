package com.ssp.apps.bankapp.customer.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.bankapp.accounts",
        "com.ssp.apps.crud.api.common"})
public class BankCustomerAccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankCustomerAccountApplication.class, args);
    }
}
