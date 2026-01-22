package com.anthoen.moneytrack.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number_account", nullable = false)
    private Integer numberAccount;

    @Column(name = "financial_institution_name", nullable = false, length = 150)
    private String financialInstitutionName;
}