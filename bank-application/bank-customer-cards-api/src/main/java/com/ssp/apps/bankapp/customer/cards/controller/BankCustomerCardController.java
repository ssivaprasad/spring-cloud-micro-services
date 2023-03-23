package com.ssp.apps.bankapp.customer.cards.controller;

import com.ssp.apps.bankapp.customer.cards.entity.BankCustomerCard;
import com.ssp.apps.bankapp.customer.cards.mapper.BankCustomerCardMapper;
import com.ssp.apps.bankapp.customer.cards.model.BankCustomerCardModel;
import com.ssp.apps.bankapp.customer.cards.service.BankCustomerCardService;
import com.ssp.apps.crud.api.common.controller.GenericController;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer/cards")
public class BankCustomerCardController extends GenericController<BankCustomerCard, Long, BankCustomerCardModel> {
    public BankCustomerCardController(BankCustomerCardService service) {
        super(service, Mappers.getMapper(BankCustomerCardMapper.class));
    }
}
