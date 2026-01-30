package com.anthoen.moneytrack.repository;

import com.anthoen.moneytrack.entity.TransactionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionCategoryRepository extends JpaRepository<TransactionCategory, Integer> {
    TransactionCategory findByCode(String code);
}
