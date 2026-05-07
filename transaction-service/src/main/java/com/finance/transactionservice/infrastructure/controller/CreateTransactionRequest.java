package com.finance.transactionservice.infrastructure.controller;

import java.math.BigDecimal;

public class CreateTransactionRequest {

    private BigDecimal amount;
    private String type;

    public BigDecimal getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
