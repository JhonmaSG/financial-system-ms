package com.finance.transactionservice.domain.port.out;

import com.finance.transactionservice.domain.model.Transaction;

public interface TransactionRepositoryPort {
    Transaction save(Transaction transaction);
}
