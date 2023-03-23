package com.ssp.apps.bankapp.customer.accounts.service;

import com.ssp.apps.bankapp.customer.accounts.entity.BankCustomerAccount;
import com.ssp.apps.bankapp.customer.accounts.repository.BankCustomerAccountRepository;
import com.ssp.apps.crud.api.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class BankCustomerAccountService extends GenericService<BankCustomerAccount, Long> {
    public BankCustomerAccountService(BankCustomerAccountRepository repository) {
        super(repository);
    }
}
