package com.ssp.apps.bankapp.customers.repository;

import com.ssp.apps.bankapp.customers.entity.BankCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankCustomerRepository extends JpaRepository<BankCustomer, Long> {
}
