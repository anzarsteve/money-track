package com.anthoen.moneytrack.controller;

import com.anthoen.moneytrack.dto.TransactionDto;
import com.anthoen.moneytrack.entity.Transaction;
import com.anthoen.moneytrack.service.interfaces.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAll();
        return ResponseEntity.ok().body(transactions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Integer id) {
        Transaction transaction = transactionService.findById(id);
        return ResponseEntity.ok().body(transaction);
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDto transactionDto) {
        Transaction createdTransaction = transactionService.save(transactionDto);
        return ResponseEntity.ok().body(createdTransaction);
    }

    @PutMapping
    public ResponseEntity<Transaction> updateTransaction(@RequestBody TransactionDto transactionDto) {
        Transaction updatedTransaction = transactionService.update(transactionDto);
        return ResponseEntity.ok().body(updatedTransaction);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Integer id) {
        transactionService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
