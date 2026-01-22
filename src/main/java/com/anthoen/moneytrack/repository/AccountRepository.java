package com.anthoen.moneytrack.repository;

import com.anthoen.moneytrack.entity.Account;
import com.anthoen.moneytrack.entity.Transaction;
import com.anthoen.moneytrack.entity.TransactionCategory;
import com.anthoen.moneytrack.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {}

