package com.example.exemplu4.repository;

import com.example.exemplu4.model.Card;
import com.example.exemplu4.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getCard(int cardNumber) {
        for(Card card : cards) {
            if(card.getCardNumber() == cardNumber) {
                return card;
            }
        }

        return null;
    }

    public void addTransaction(int cardNumber, Transaction transaction) {
        Card card = getCard(cardNumber);
        card.getTransactionList().add(transaction);
    }

    public List<Transaction> getTransactions(int cardNumber) {
        Card card = getCard(cardNumber);
        return card.getTransactionList();
    }
}
