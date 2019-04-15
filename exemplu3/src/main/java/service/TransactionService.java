package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.TransactionRepository;

@Component
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }

    public void setTransactionRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public String toString() {
        return "TransactionService{" +
                "transactionRepository=" + transactionRepository +
                '}';
    }
}
