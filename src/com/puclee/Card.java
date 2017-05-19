package com.puclee;

/**
 * Created by PucLee on 10.05.2017.
 */
public class Card {
    private Account onwerAccount;
    private int passCode;

    public Card(Account onwerAccount, int passCode) {
        this.onwerAccount = onwerAccount;
        this.passCode = passCode;
    }

    /**
     *  This method checks whether the user entered
     *  the correct passcode
     * @param passCode integer value
     * @return true if user entered good password, false if not.
     */
    public boolean checkPassCode(int passCode){

        if(this.passCode == passCode)
            return true;
        return false;
    }

    public Account getOnwerAccount() {
        return onwerAccount;
    }
}
