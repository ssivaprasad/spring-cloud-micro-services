package com.ssp.apps.bankapp.customer.accounts.entity;


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
@Table(name = "bank_customer_accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long customerId;
    private String accountType;
    private String accountStatus;
    private String accountCreationDate;
}
