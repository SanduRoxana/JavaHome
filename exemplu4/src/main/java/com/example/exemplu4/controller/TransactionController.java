package com.example.exemplu4.controller;

import com.example.exemplu4.model.Transaction;
import com.example.exemplu4.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

//    @PostMapping(path = "/add/transaction")
//    public void addTransaction(@RequestBody Transaction transaction) {
//        transactionService.addTransaction(transaction);
//    }
//
//    @GetMapping(path = "/get/transaction")
//    public List<Transaction> getTransactions() {
//        return transactionService.getTransactions();
//    }

    @PutMapping(path = "/update/transaction")
    public void updateTransaction(@RequestBody Transaction transaction) {
        transactionService.updateTransaction(transaction);
    }

    @DeleteMapping(path = "/delete/transaction")
    public void deleteTransaction(@RequestBody Transaction transaction) {
        transactionService.deleteTransaction(transaction);
    }
}
