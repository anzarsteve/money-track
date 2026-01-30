package com.anthoen.moneytrack.service.interfaces;

import com.anthoen.moneytrack.entity.TransactionType;

import java.util.List;

public interface TransactionTypeInterface {

    TransactionType findByCode(String code);

    TransactionType save(TransactionType transactionType);

    List<TransactionType> getAll();

    TransactionType getById(Integer id);

    TransactionType update(TransactionType transactionType);

    void softDelete(Integer id);

    void delete(Integer id);
}
