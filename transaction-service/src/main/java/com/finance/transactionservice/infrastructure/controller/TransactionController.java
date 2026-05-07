package com.finance.transactionservice.infrastructure.controller;

import com.finance.transactionservice.application.usecase.CreateTransactionUseCase;
import com.finance.transactionservice.domain.model.Transaction;
import com.finance.transactionservice.domain.model.TransactionType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final CreateTransactionUseCase useCase;

    public TransactionController(CreateTransactionUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public Transaction create(@RequestBody CreateTransactionRequest request) {

        TransactionType type = TransactionType.valueOf(request.getType().toUpperCase());

        return useCase.execute(request.getAmount(), type);
    }
}
