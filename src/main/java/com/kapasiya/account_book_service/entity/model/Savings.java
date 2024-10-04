package com.kapasiya.account_book_service.entity.model;

import com.kapasiya.account_book_service.entity.base.BaseEntity;
import com.kapasiya.account_book_service.enums.Currency;
import jakarta.validation.constraints.NotNull;
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
public class Savings extends BaseEntity {

    @NotNull private BigDecimal amount;
    @NotNull private Currency currency;
    @NotNull private BigDecimal interest;
    @NotNull private Boolean deposit;
    @NotNull private Boolean capitalization;
}
