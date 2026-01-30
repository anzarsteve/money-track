package com.anthoen.moneytrack.controller;

import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.service.interfaces.TransactionTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction_type")
@RequiredArgsConstructor
public class TransactionTypeController {

    private final TransactionTypeService transactionTypeInterface;

    @GetMapping("/{code}")
    public ResponseEntity<TransactionType> findByCode(@PathVariable String code){
        TransactionType obj = transactionTypeInterface.findByCode(code);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<java.util.List<TransactionType>> getAll(){
        java.util.List<TransactionType> list = transactionTypeInterface.getAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<TransactionType> create(@RequestBody TransactionType transactionType){
        TransactionType obj = transactionTypeInterface.save(transactionType);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping
    public ResponseEntity<TransactionType> update(@RequestBody TransactionType transactionType){
        TransactionType obj = transactionTypeInterface.update(transactionType);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam Integer id){
        transactionTypeInterface.delete(id);
        return ResponseEntity.noContent().build();
    }
}
