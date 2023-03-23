package com.ssp.apps.bankapp.customer.cards.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bank_customer_cards")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomerCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long customerId;
    private long accountId;
    private String cardNo;
    private String cardType;
    private String cardExpiryDate;
    private String cardStatus;
}
