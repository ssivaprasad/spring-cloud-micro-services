package com.ssp.apps.bankapp.customers.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "bank_customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private long phone;
}
