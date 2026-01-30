package com.anthoen.moneytrack.service.implement;

import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.repository.TransactionTypeRepository;
import com.anthoen.moneytrack.service.interfaces.TransactionTypeService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionTypeImpl implements TransactionTypeService {

    private final TransactionTypeRepository transactionTypeRepository;

    public TransactionType findByCode(String code){
        return transactionTypeRepository.findByCode(code);
    }

    @Override
    public TransactionType save(TransactionType transactionType) {
        return transactionTypeRepository.save(transactionType);
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
        TransactionType existingObj = getById(transactionType.getId());
        if(existingObj != null) {
            existingObj.setCode(transactionType.getCode());
            existingObj.setDescription(transactionType.getDescription());
            return transactionTypeRepository.save(existingObj);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        transactionTypeRepository.deleteById(id);
    }

}
