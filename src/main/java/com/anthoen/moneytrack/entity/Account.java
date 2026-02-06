package com.anthoen.moneytrack.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number_account")
    private String numberAccount;

    @Column(name = "financial_institution_name", length = 150)
    private String financialInstitutionName;
}