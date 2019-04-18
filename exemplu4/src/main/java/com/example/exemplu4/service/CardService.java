package com.example.exemplu4.service;

import com.example.exemplu4.model.Card;
import com.example.exemplu4.model.Transaction;
import com.example.exemplu4.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCard(Card card) {
        cardRepository.addCard(card);
    }

    public List<Card> getCards() {
        return cardRepository.getCards();
    }

    public void addTransaction(int cardNumber, Transaction transaction) {
        cardRepository.addTransaction(cardNumber, transaction);
    }

    public List<Transaction> getTransactions(int cardNumber) {
        return cardRepository.getTransactions(cardNumber);
    }
}
