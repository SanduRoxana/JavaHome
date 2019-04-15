package config;

import beans.TransactionRepository;
import beans.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    //@Primary
    public TransactionRepository transactionRepository() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setNume("Transaction 1");

        return transactionRepository;
    }

    @Bean
    //@Primary
    @Scope(scopeName = "prototype")
    public TransactionRepository transactionRepository2() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setNume("Transaction 2");

        return transactionRepository;
    }

    @Bean
    public TransactionService transactionService() {
        TransactionService transactionService = new TransactionService();
        transactionService.setTransactionRepository(transactionRepository());

        return transactionService;
    }
}
