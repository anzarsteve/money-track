package com.anthoen.moneytrack.service.interfaces;

import com.anthoen.moneytrack.entity.Account;

import java.util.List;

public interface AccountService {

    Account findById(Integer id);

    Account save(Account account);

    List<Account> getAll();

    Account update(Account account);

    void delete(Integer id);

}
