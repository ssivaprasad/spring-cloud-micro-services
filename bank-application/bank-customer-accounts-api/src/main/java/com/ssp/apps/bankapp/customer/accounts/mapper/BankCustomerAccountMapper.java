package com.ssp.apps.bankapp.customer.accounts.mapper;

import com.ssp.apps.bankapp.customer.accounts.entity.BankCustomerAccount;
import com.ssp.apps.bankapp.customer.accounts.model.BankCustomerAccountModel;
import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BankCustomerAccountMapper extends GenericMapper<BankCustomerAccount, BankCustomerAccountModel> {
}
