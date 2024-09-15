package com.example.strategy;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public interface Discount {

    BigDecimal applyDiscount(BigDecimal amount);

    static Discount christmasDiscount() {
        return amount -> amount.multiply(valueOf(0.9));
    }

    static Discount newYearDiscount() {
        return amount -> amount.multiply(valueOf(0.8));
    }

    static Discount easterDiscount() {
        return amount -> amount.multiply(valueOf(0.5));
    }
}
