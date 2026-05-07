package com.finance.transactionservice.application.usecase;

import com.finance.transactionservice.domain.model.Transaction;
import com.finance.transactionservice.domain.model.TransactionType;
import com.finance.transactionservice.domain.port.in.CreateTransactionUseCasePort;
import com.finance.transactionservice.domain.port.out.TransactionRepositoryPort;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class CreateTransactionUseCase implements CreateTransactionUseCasePort {

    private final TransactionRepositoryPort repository;

    public CreateTransactionUseCase(TransactionRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public Transaction execute(BigDecimal amount, TransactionType type) {

        Transaction transaction = new Transaction(
                UUID.randomUUID().toString(),
                amount,
                type,
                LocalDateTime.now()
        );

        return repository.save(transaction);
    }
}