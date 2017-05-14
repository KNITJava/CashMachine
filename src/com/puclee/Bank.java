package com.puclee;

/**
 * Created by PucLee on 10.05.2017.
 */
public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    /**
     * @param ownerName the name of user
     * @param deposit initial deposit
     */
    Account createAccount(String ownerName, double deposit){

        return new Account(ownerName, this, deposit);
    }
}
