package com.ssp.apps.bankapp.customers.controller;

import com.ssp.apps.bankapp.customers.entity.BankCustomer;
import com.ssp.apps.bankapp.customers.mapper.BankCustomerMapper;
import com.ssp.apps.bankapp.customers.model.BankCustomerModel;
import com.ssp.apps.bankapp.customers.service.BankCustomerService;
import com.ssp.apps.crud.api.common.controller.GenericController;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customers")
public class BankCustomerController extends GenericController<BankCustomer, Long, BankCustomerModel> {
    public BankCustomerController(BankCustomerService service) {
        super(service, Mappers.getMapper(BankCustomerMapper.class));
    }
}
