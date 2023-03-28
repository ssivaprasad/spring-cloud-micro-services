package com.ssp.apps.bankapp.customers.apiclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bank-customer-cards-management-api" , url = "http://localhost:9021")
public interface CardsManagementApiClient {

    @GetMapping(value = "/health-check")
    public Object getHealth();

}
