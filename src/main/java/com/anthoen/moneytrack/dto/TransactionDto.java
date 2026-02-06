package com.anthoen.moneytrack.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransactionDto {

    private String description;

    @NotNull
    private Integer quantity;

    @NotNull
    private BigDecimal unitPrice;

    @NotNull
    private Integer accountId;

    @NotNull
    private Integer transactionTypeId;

    @NotNull
    private Integer transactionCategoryId;

}
