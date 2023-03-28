package com.ssp.apps.bankapp.customers.apiclient;

import com.ssp.apps.bankapp.customers.enums.AccountStatusCode;
import com.ssp.apps.bankapp.customers.enums.CardStatusCode;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FeignClient(name = "bank-reference-data-api", url = "http://localhost:9031")
public interface ReferenceDataApiClient {

    @GetMapping(value = "/health-check")
    Object getHealth();

    @GetMapping(value = "/reference-data/account/statuses")
    @CircuitBreaker(name = "bankReferenceDataApiClientAccountStatuses")
    List<AccountStatusCode> getAllAccountStatuses();

    @GetMapping(value = "/reference-data/card/statuses")
    List<CardStatusCode> getAllCardStatuses();

}
