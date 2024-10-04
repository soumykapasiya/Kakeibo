package com.kapasiya.account_book_service.entity.model;

import com.kapasiya.account_book_service.entity.base.BaseEntity;
import com.kapasiya.account_book_service.enums.Currency;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "incomes")
@EqualsAndHashCode(callSuper = true)
public class Income extends BaseEntity {

    private String title;
    private String description;
    private BigDecimal amount;

    @NotNull
    private Currency currency;
}
