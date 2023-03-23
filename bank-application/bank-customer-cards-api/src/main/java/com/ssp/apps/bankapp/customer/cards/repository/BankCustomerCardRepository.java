package com.ssp.apps.bankapp.customer.cards.repository;

import com.ssp.apps.bankapp.customer.cards.entity.BankCustomerCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankCustomerCardRepository extends JpaRepository<BankCustomerCard, Long> {
}
