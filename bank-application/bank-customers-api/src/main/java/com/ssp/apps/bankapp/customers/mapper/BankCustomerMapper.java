package com.ssp.apps.bankapp.customers.mapper;

import com.ssp.apps.bankapp.customers.entity.BankCustomer;
import com.ssp.apps.bankapp.customers.model.BankCustomerModel;
import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BankCustomerMapper extends GenericMapper<BankCustomer, BankCustomerModel> {
}
