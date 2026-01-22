package com.anthoen.moneytrack.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transaction_category")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class TransactionCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 30)
    private String code; // FOOD, RENT, etc.

    @Column(nullable = false, length = 150)
    private String description;
}