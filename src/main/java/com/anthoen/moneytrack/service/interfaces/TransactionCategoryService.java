package com.anthoen.moneytrack.service.interfaces;

import com.anthoen.moneytrack.entity.TransactionCategory;

public interface TransactionCategoryService {

    TransactionCategory findByCode(String code);

    TransactionCategory save(TransactionCategory transactionCategory);

    java.util.List<TransactionCategory> getAll();

    TransactionCategory getById(Integer id);

    TransactionCategory update(TransactionCategory transactionCategory);

    void delete(Integer id);

}
