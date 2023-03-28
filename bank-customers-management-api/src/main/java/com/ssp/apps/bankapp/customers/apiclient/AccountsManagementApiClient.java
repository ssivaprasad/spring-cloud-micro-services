package com.ssp.apps.bankapp.customers.apiclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bank-customer-accounts-management-api" , url = "http://localhost:9011")
public interface AccountsManagementApiClient {

    @GetMapping(value = "/health-check")
    public Object getHealth();

}
