package com.ssp.apps.bankapp.customers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RefreshScope
public class BankCustomerModel {

    private long id;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private long phone;
}
