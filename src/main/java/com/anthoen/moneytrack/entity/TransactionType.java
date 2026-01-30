package com.anthoen.moneytrack.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transaction_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionType extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 30)
    private String code; // EXPENSE, INCOME

    @Column(nullable = false, length = 150)
    private String description;
}