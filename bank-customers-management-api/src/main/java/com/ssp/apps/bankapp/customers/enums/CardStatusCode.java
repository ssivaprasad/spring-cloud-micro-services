package com.ssp.apps.bankapp.customers.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum CardStatusCode {
    ACTIVE("ACTIVE","Active"),
    BLOCKED("BLOCKED","Blocked"),
    EXPIRED("EXPIRED","Expired");

    private final String code;
    private final String description;

    public List<CardStatusCode> getAllStatuses(){
        return Arrays.stream(values()).collect(Collectors.toList());
    }
}
