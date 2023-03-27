package com.ssp.apps.bankapp.customers.service;

import com.ssp.apps.bankapp.customers.entity.BankCustomer;
import com.ssp.apps.bankapp.customers.repository.BankCustomerRepository;
import com.ssp.apps.crud.api.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class BankCustomerService extends GenericService<BankCustomer, Long> {
    public BankCustomerService(BankCustomerRepository repository) {
        super(repository);
    }
}
