package com.anthoen.moneytrack.service.interfaces;

import com.anthoen.moneytrack.dto.TransactionDto;
import com.anthoen.moneytrack.entity.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction findById(Integer id);

    Transaction save(TransactionDto transaction);

    List<Transaction> getAll();

    Transaction update(TransactionDto transactionDto);

    void delete(Integer id);

    void softDelete(Integer id);

}
