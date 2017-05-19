package com.puclee;


public class Main {


    public static void main(String[] args) {
        CashMachine cashMachine =
                new CashMachine("XJD", "Krakow");

        Bank pkoBank = new Bank("com.puclee.Bank PKO");
        Account wojtekAccount =
                pkoBank.createAccount("Wojtek",
                        100);

        Card wojtekCard = wojtekAccount.createNewCard(1234);

        cashMachine.insertCard(wojtekCard);

    }
}
