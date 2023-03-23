package com.ssp.apps.bankapp.customer.accounts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomerAccountModel {

    private long id;
    private long customerId;
    private String accountType;
    private String accountStatus;
    private String accountCreationDate;
}
