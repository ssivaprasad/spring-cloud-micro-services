package com.ssp.apps.bankapp.customers.controller;

import com.ssp.apps.bankapp.customers.apiclient.ReferenceDataApiClient;
import com.ssp.apps.bankapp.customers.enums.AccountStatusCode;
import com.ssp.apps.bankapp.customers.enums.CardStatusCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reference/data")
@RequiredArgsConstructor
public class ReferenceDataApiController {

    private final ReferenceDataApiClient referenceDataApiClient;

    @GetMapping("/account/statuses")
    public List<AccountStatusCode> getAccountStatusCodes() {
        return referenceDataApiClient.getAllAccountStatuses();
    }

    @GetMapping("/card/statuses")
    public List<CardStatusCode> getCardStatusCodes() {
        return referenceDataApiClient.getAllCardStatuses();
    }
}
