package com.anthoen.moneytrack.service.implement;

import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.repository.TransactionTypeRepository;
import com.anthoen.moneytrack.service.interfaces.TransactionTypeInterface;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionTypeImplement implements TransactionTypeInterface {

    private final TransactionTypeRepository transactionTypeRepository;

    public TransactionType findByCode(String code){
        return transactionTypeRepository.findByCode(code);
    }

    @Override
    public TransactionType save(TransactionType transactionType) {
        TransactionType obj = transactionTypeRepository.save(transactionType);
        return obj;
    }

    @Override
    public List<TransactionType> getAll() {
        return transactionTypeRepository.findAll();
    }

    @Override
    public TransactionType getById(Integer id) {
        Optional<TransactionType> obj = transactionTypeRepository.findById(id);
        return obj.orElse(null);
    }

    @Override
    public TransactionType update(TransactionType transactionType) {
        return null;
    }

    @Override
    public void softDelete(Integer id) {
        TransactionType obj = getById(id);
        if(obj != null) {
            obj.setActive(false);
            transactionTypeRepository.save(obj);
        }
    }

    @Override
    public void delete(Integer id) {
        transactionTypeRepository.deleteById(id);
    }

}
