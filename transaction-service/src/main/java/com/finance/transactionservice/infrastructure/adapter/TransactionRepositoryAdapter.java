package com.finance.transactionservice.infrastructure.adapter;

import com.finance.transactionservice.domain.model.Transaction;
import com.finance.transactionservice.domain.port.out.TransactionRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class TransactionRepositoryAdapter  implements TransactionRepositoryPort {

    @Override
    public Transaction save(Transaction transaction) {
        // Simulación de Persistencia
        System.out.println("Saving Transaction: " + transaction.getId());

        return transaction;
    }
}
