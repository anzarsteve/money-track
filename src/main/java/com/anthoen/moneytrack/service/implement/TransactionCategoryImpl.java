package com.anthoen.moneytrack.service.implement;

import com.anthoen.moneytrack.entity.TransactionCategory;
import com.anthoen.moneytrack.entity.TransactionType;
import com.anthoen.moneytrack.repository.TransactionCategoryRepository;
import com.anthoen.moneytrack.service.interfaces.TransactionCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionCategoryImpl implements TransactionCategoryService {

    private final TransactionCategoryRepository transactionCategoryRepository;

    @Override
    public TransactionCategory findByCode(String code) {
        return transactionCategoryRepository.findByCode(code);
    }

    @Transactional
    @Override
    public TransactionCategory save(TransactionCategory transactionCategory) {
        return transactionCategoryRepository.save(transactionCategory);
    }

    @Override
    public List<TransactionCategory> getAll() {
        return transactionCategoryRepository.findAll();
    }

    @Override
    public TransactionCategory getById(Integer id) {
        Optional<TransactionCategory> obj = transactionCategoryRepository.findById(id);
        return obj.orElse(null);
    }

    @Override
    public TransactionCategory update(TransactionCategory transactionCategory) {
        TransactionCategory existingObj = getById(transactionCategory.getId());
        if(existingObj != null) {
            existingObj.setCode(transactionCategory.getCode());
            existingObj.setDescription(transactionCategory.getDescription());
            return transactionCategoryRepository.save(existingObj);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        // delete
        transactionCategoryRepository.deleteById(id);
    }
}
