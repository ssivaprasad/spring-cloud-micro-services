package com.ssp.apps.bankapp.referencedata.controller;

import com.ssp.apps.bankapp.referencedata.enums.AccountStatusCode;
import com.ssp.apps.bankapp.referencedata.enums.CardStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reference-data")
public class ReferenceDataApiController {

    @GetMapping("/account/statuses")
    public List<AccountStatusCode> getAccountStatusCodes() {
        return AccountStatusCode.getAllStatuses();
    }

    @GetMapping("/card/statuses")
    public List<CardStatusCode> getCardStatusCodes() {
        return CardStatusCode.getAllStatuses();
    }
}
