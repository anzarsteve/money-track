package com.anthoen.moneytrack.repository;

import com.anthoen.moneytrack.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, Integer> {
    TransactionType findByCode(String code);
}
