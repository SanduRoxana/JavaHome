package com.example.exemplu4.model;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String ownerName;
    private int cardNumber;
    private List<Transaction> transactionList = new ArrayList<>();

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "Card{" +
                "ownerName='" + ownerName + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
