package com.anthoen.moneytrack.repository;

import com.anthoen.moneytrack.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByAccountId(Integer accountId);
}
