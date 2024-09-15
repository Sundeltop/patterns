package com.example.strategy;

import java.math.BigDecimal;

public class OrderService {

    public OrderService() {
    }

    public BigDecimal pay(BigDecimal price, Discount discount) {
        return discount.applyDiscount(price);
    }
}
