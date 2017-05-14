package com.puclee;

/**
 * Created by PucLee on 10.05.2017.
 */
public class Account {
    private String ownerName;
    private Bank bank;
    private double saldo;
    private Card accountCard = null;


    public Account(String ownerName, Bank bank, double saldo) {
        this.ownerName = ownerName;
        this.bank = bank;
        this.saldo = saldo;
    }

    public Card createNewCard(int passCode) {
        if (accountCard == null) {
            return new Card(this, passCode);
        }
        return accountCard;
    }
}
