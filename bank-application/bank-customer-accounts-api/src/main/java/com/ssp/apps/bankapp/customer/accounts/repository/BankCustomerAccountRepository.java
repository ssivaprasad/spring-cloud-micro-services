package com.ssp.apps.bankapp.customer.accounts.repository;

import com.ssp.apps.bankapp.customer.accounts.entity.BankCustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankCustomerAccountRepository extends JpaRepository<BankCustomerAccount, Long> {
}
