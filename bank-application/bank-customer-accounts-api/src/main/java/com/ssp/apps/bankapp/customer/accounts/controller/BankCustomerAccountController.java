package com.ssp.apps.bankapp.customer.accounts.controller;

import com.ssp.apps.bankapp.customer.accounts.entity.BankCustomerAccount;
import com.ssp.apps.bankapp.customer.accounts.mapper.BankCustomerAccountMapper;
import com.ssp.apps.bankapp.customer.accounts.model.BankCustomerAccountModel;
import com.ssp.apps.bankapp.customer.accounts.service.BankCustomerAccountService;
import com.ssp.apps.crud.api.common.controller.GenericController;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer/accounts")
public class BankCustomerAccountController extends GenericController<BankCustomerAccount, Long, BankCustomerAccountModel> {
    public BankCustomerAccountController(BankCustomerAccountService service) {
        super(service, Mappers.getMapper(BankCustomerAccountMapper.class));
    }
}
