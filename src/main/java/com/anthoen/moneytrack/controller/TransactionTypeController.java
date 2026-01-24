package com.anthoen.moneytrack.controller;

import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.service.interfaces.TransactionTypeInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction_type")
@RequiredArgsConstructor
public class TransactionTypeController {

    private final TransactionTypeInterface transactionTypeInterface;

    @GetMapping("/{code}")
    public ResponseEntity<TransactionType> findByCode(@PathVariable String code){
        TransactionType obj = transactionTypeInterface.findByCode(code);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "hol amundo";
    }
}
