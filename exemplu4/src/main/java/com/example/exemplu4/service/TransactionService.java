package com.example.exemplu4.service;

import com.example.exemplu4.model.Transaction;
import com.example.exemplu4.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

//    public void addTransaction(Transaction transaction) {
//        transactionRepository.addTransaction(transaction);
//    }
//
//    public List<Transaction> getTransactions() {
//        return transactionRepository.getTransactions();
//    }

    public void updateTransaction(Transaction transaction) {
        transactionRepository.updateTransaction(transaction);
    }

    public void deleteTransaction(Transaction transaction) {
        transactionRepository.deleteTransaction(transaction);
    }
}
