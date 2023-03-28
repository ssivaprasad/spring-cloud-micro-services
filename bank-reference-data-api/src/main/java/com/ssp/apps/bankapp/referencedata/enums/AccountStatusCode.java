package com.ssp.apps.bankapp.referencedata.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum AccountStatusCode {

    ACTIVE("ACTIVE","Active"),
    BLOCKED("BLOCKED","Blocked"),
    TERMINATED("TERMINATED","Terminated"),
    DORMANT("DORMANT","InActive");

    private final String code;
    private final String description;

    public static List<AccountStatusCode> getAllStatuses(){
        return Arrays.stream(values()).collect(Collectors.toList());
    }

}
