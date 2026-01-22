package com.anthoen.moneytrack.service.interfaces;

import com.anthoen.moneytrack.entity.TransactionType;

import java.util.Optional;

public interface TransactionTypeInterface {

    Optional<TransactionType> findByCode(String code);
}
