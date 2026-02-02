package com.anthoen.moneytrack.controller;

import com.anthoen.moneytrack.entity.Account;
import com.anthoen.moneytrack.service.interfaces.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Integer id) {
        return accountService.findById(id);
    }
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.save(account);
    }

    @PutMapping
    public Account updateAccount(@RequestBody Account account) {
        return accountService.update(account);
    }

    @DeleteMapping
    public void deleteAccount(@RequestParam Integer id) {
        accountService.delete(id);
    }
}
