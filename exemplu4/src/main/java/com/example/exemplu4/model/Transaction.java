package com.example.exemplu4.model;

public class Transaction {
    private double amount;
    private String store;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", store='" + store + '\'' +
                '}';
    }
}
