package com.ssp.apps.bankapp.customer.cards.mapper;

import com.ssp.apps.bankapp.customer.cards.entity.BankCustomerCard;
import com.ssp.apps.bankapp.customer.cards.model.BankCustomerCardModel;
import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BankCustomerCardMapper extends GenericMapper<BankCustomerCard, BankCustomerCardModel> {
}
