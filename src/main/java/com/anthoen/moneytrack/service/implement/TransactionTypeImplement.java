package com.anthoen.moneytrack.service.implement;

import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.repository.TransactionRepository;
import com.anthoen.moneytrack.repository.TransactionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionTypeImplement {

    private final TransactionTypeRepository transactionTypeRepository;

    public TransactionType findByCode(String code) throws ChangeSetPersister.NotFoundException {

        return transactionTypeRepository.findByCode(code).orElseThrow(() -> new ChangeSetPersister.NotFoundException());


    }
}
