package com.ssp.apps.bankapp.customers.apiclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bank-customer-accounts-api" , url = "http://localhost:9001")
public interface BankCustomerAccountClient {

    @GetMapping(value = "/health-check")
    public Object getHealth();

}
