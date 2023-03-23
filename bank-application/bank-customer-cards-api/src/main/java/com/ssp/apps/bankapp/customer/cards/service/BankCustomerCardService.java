package com.ssp.apps.bankapp.customer.cards.service;

import com.ssp.apps.bankapp.customer.cards.entity.BankCustomerCard;
import com.ssp.apps.bankapp.customer.cards.repository.BankCustomerCardRepository;
import com.ssp.apps.crud.api.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class BankCustomerCardService extends GenericService<BankCustomerCard, Long> {
    public BankCustomerCardService(BankCustomerCardRepository repository) {
        super(repository);
    }
}
