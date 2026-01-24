package com.anthoen.moneytrack.service.implement;

import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.repository.TransactionTypeRepository;
import com.anthoen.moneytrack.service.interfaces.TransactionTypeInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionTypeImplement implements TransactionTypeInterface {

    private final TransactionTypeRepository transactionTypeRepository;

    public TransactionType findByCode(String code){
        return transactionTypeRepository.findByCode(code);
    }
}
