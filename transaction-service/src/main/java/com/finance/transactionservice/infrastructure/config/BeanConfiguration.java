package com.finance.transactionservice.infrastructure.config;

import com.finance.transactionservice.application.usecase.CreateTransactionUseCase;
import com.finance.transactionservice.domain.port.out.TransactionRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateTransactionUseCase createTransactionUseCase(TransactionRepositoryPort repositoryPort) {
        return new CreateTransactionUseCase(repositoryPort);
    }
}
