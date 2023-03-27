package com.ssp.apps.bankapp.customer.cards.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomerCardModel {

    private long id;

    private long customerId;
    private long accountId;
    private String cardNo;
    private String cardType;
    private String cardExpiryDate;
    private String cardStatus;
}
