package com.example.exemplu4.controller;

import com.example.exemplu4.model.Card;
import com.example.exemplu4.model.Transaction;
import com.example.exemplu4.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {
    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(path = "/add/card")
    public void addCard(@RequestBody Card card) {
        cardService.addCard(card);
    }

    @GetMapping(path = "/get/card")
    public List<Card> getCards() {
        return cardService.getCards();
    }

    @PostMapping(path = "/add/transactionCard/{cardNumber}")
    public void addTransaction(@PathVariable int cardNumber, @RequestBody Transaction transaction) {
        cardService.addTransaction(cardNumber, transaction);
    }

    @GetMapping(path = "/get/transactionCard/{cardNumber}")
    public List<Transaction> getTransactions(@PathVariable int cardNumber) {
        return cardService.getTransactions(cardNumber);
    }

//    @PutMapping(path = "/update/transaction/{cardNumber}/{id}")
//    public void updateTransaction(@PathVariable int cardNumber, int id, @RequestBody Transaction transaction) {
//
//    }
//
//    @DeleteMapping(path = "/delete/transaction/{cardNumber}/{id}")
//    public void deleteTransaction(@PathVariable int cardNumber, int id, @RequestBody Transaction transaction) {
//
//    }

}