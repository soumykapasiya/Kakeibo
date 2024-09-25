package com.kapasiya.account_book_service.enums;

public enum Currency {
    USD, EUR, RUB, RS;

    public static Currency getBase() {
        return RS;
    }
}
