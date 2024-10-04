package com.kapasiya.account_book_service.entity.model;

import com.kapasiya.account_book_service.entity.base.BaseEntity;
import com.kapasiya.account_book_service.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Expenses extends BaseEntity {
    private String title;
    private String description;
    private BigDecimal amount;
    private String categoryID;

    private Currency currency;
}
