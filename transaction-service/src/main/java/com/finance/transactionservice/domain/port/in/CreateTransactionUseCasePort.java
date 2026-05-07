package com.finance.transactionservice.domain.port.in;

import com.finance.transactionservice.domain.model.Transaction;
import com.finance.transactionservice.domain.model.TransactionType;

import java.math.BigDecimal;

public interface CreateTransactionUseCasePort {
    Transaction execute(BigDecimal amount, TransactionType type);
}
