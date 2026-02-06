package com.anthoen.moneytrack.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Transaction extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String description;

    @Column(nullable = false)

    private Integer quantity;

    @Column(name = "unit_price", nullable = false, precision = 12, scale = 2)
    private BigDecimal unitPrice;

    /**
     * IMPORTANTE:
     * total_amount lo calcula la BD con GENERATED ALWAYS AS (quantity * unit_price) STORED
     * => En JPA lo marcamos solo lectura (no insert, no update).
     */
    @Column(name = "total_amount", precision = 14, scale = 2, insertable = false, updatable = false)
    private BigDecimal totalAmount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_account", nullable = false)
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_transaction_type", nullable = false)
    private TransactionType transactionType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_transaction_category", nullable = false)
    private TransactionCategory transactionCategory;
}