package com.anthoen.moneytrack.controller;

import com.anthoen.moneytrack.entity.TransactionCategory;
import com.anthoen.moneytrack.service.interfaces.TransactionCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction_category")
@RequiredArgsConstructor
public class TransactionCategoryController {

    private final TransactionCategoryService transactionCategoryService;

    @GetMapping("/{code}")
    public ResponseEntity<TransactionCategory> findByCode(@PathVariable String code){
        TransactionCategory obj = transactionCategoryService.findByCode(code);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<TransactionCategory>> getAll() {
        List<TransactionCategory> list = transactionCategoryService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<TransactionCategory> create(@RequestBody TransactionCategory transactionCategory){
        TransactionCategory obj = transactionCategoryService.save(transactionCategory);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping
    public ResponseEntity<TransactionCategory> update(@RequestBody TransactionCategory transactionCategory) {
        TransactionCategory obj = transactionCategoryService.update(transactionCategory);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam Integer id){
        transactionCategoryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
