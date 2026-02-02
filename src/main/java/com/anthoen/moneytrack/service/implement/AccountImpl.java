package com.anthoen.moneytrack.service.implement;

import com.anthoen.moneytrack.entity.Account;
import com.anthoen.moneytrack.repository.AccountRepository;
import com.anthoen.moneytrack.service.interfaces.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account findById(Integer id) {
        return accountRepository.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Transactional
    @Override
    public Account update(Account account) {
        Account existingObj = findById(account.getId());
        if(existingObj != null) {
            existingObj.setNumberAccount(account.getNumberAccount());
            existingObj.setFinancialInstitutionName(account.getFinancialInstitutionName());
            return accountRepository.save(existingObj);
        }
        return null;
    }

    @Transactional
    @Override
    public void delete(Integer id) {
            accountRepository.deleteById(id);
    }
}
