package com.ssp.apps.bankapp.customers.controller;

import com.ssp.apps.bankapp.customers.apiclient.AccountsManagementApiClient;
import com.ssp.apps.bankapp.customers.apiclient.CardsManagementApiClient;
import com.ssp.apps.bankapp.customers.apiclient.ReferenceDataApiClient;
import com.ssp.apps.crud.api.common.exception.RequestValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class DownstreamHealthCheckController {

    private final AccountsManagementApiClient accountsManagementApiClient;
    private final CardsManagementApiClient cardsManagementApiClient;
    private final ReferenceDataApiClient referenceDataApiClient;

    @GetMapping("/{clientId}/health")
    public Object checkHealth(@PathVariable("clientId") String clientId) {
        if ("bank-customer-accounts-management-api".equals(clientId)) {
            return accountsManagementApiClient.getHealth();
        } else if ("bank-customer-cards-management-api".equals(clientId)) {
            return cardsManagementApiClient.getHealth();
        } else if ("bank-reference-data-management-api".equals(clientId)) {
            return referenceDataApiClient.getHealth();
        }

        throw new RequestValidationException(Arrays.asList("Invalid Client Id"));
    }
}
