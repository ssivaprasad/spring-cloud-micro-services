package com.ssp.apps.bankapp.customers.controller;

import com.ssp.apps.bankapp.customers.apiclient.BankCustomerAccountClient;
import com.ssp.apps.crud.api.common.exception.RequestValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/clients")
public class DownstreamHealthCheckController {

    @Autowired
    private BankCustomerAccountClient bankCustomerAccountClient;

    @GetMapping("health/{clientId}")
    public Object checkHealth(@PathVariable("clientId") String clientId) {
        if ("bank-customer-accounts-api".equals(clientId)) {
            return bankCustomerAccountClient.getHealth();
        }

        throw  new RequestValidationException(Arrays.asList("Invalid Client Id"));
    }
}
