package com.ssp.apps.bankapp.referencedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ssp.apps.bankapp.referencedata",
        "com.ssp.apps.crud.api.common"})
public class BankReferenceDataApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankReferenceDataApiApplication.class, args);
    }
}
