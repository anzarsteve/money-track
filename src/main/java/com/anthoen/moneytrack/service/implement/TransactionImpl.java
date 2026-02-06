package com.anthoen.moneytrack.service.implement;


import com.anthoen.moneytrack.dto.TransactionDto;
import com.anthoen.moneytrack.entity.Transaction;
import com.anthoen.moneytrack.entity.TransactionCategory;
import com.anthoen.moneytrack.repository.AccountRepository;
import com.anthoen.moneytrack.repository.TransactionCategoryRepository;
import com.anthoen.moneytrack.repository.TransactionRepository;
import com.anthoen.moneytrack.repository.TransactionTypeRepository;
import com.anthoen.moneytrack.service.interfaces.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    private final AccountRepository accountRepository;

    private final TransactionTypeRepository transactionTypeRepository;

    private final TransactionCategoryRepository transactionCategoryRepository;

    @Override
    public Transaction findById(Integer id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @Override
    public Transaction save(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        transaction.setDescription(transactionDto.getDescription());
        transaction.setQuantity(transactionDto.getQuantity());
        transaction.setUnitPrice(transactionDto.getUnitPrice());

        transaction.setAccount(accountRepository.getReferenceById(transactionDto.getAccountId()));
        transaction.setTransactionType(transactionTypeRepository.getReferenceById(transactionDto.getTransactionTypeId()));
        transaction.setTransactionCategory(transactionCategoryRepository.getReferenceById(transactionDto.getTransactionCategoryId()));

        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction update(TransactionDto transactionDto) {
        Transaction transaction = findById(transactionDto.getAccountId());
        if (transaction != null) {
            transaction.setDescription(transactionDto.getDescription());
            transaction.setQuantity(transactionDto.getQuantity());
            transaction.setUnitPrice(transactionDto.getUnitPrice());

            transaction.setAccount(accountRepository.getReferenceById(transactionDto.getAccountId()));
            transaction.setTransactionType(transactionTypeRepository.getReferenceById(transactionDto.getTransactionTypeId()));
            transaction.setTransactionCategory(transactionCategoryRepository.getReferenceById(transactionDto.getTransactionCategoryId()));
            return transactionRepository.save(transaction);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public void softDelete(Integer id) {
        Transaction transaction = findById(id);
        if (transaction != null) {
            transaction.setActive(false);
            transactionRepository.save(transaction);
        }
    }
}
