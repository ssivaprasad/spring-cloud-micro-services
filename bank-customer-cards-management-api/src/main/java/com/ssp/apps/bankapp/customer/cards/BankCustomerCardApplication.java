package com.ssp.apps.bankapp.customer.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.bankapp.cards",
        "com.ssp.apps.crud.api.common"})
public class BankCustomerCardApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankCustomerCardApplication.class, args);
    }
}
