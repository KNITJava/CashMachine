package com.puclee;

import java.util.Scanner;

public class CashMachine extends Machine {
    private String localization;

    public CashMachine(String serialNumber, String localization) {
        super(serialNumber);
        this.localization = localization;

    }

    @Override
    protected void showSerialNumber() {
        System.out.println("[BANKOMAT]");
        super.showSerialNumber();
    }



    /**
     * Users panel controller.
     *
     * @param card inserted card's object
     */
    public void insertCard(Card card) {
        int usersInput = 0;
        System.out.println("Witamy w bankomacie w [" + localization + "]");
        System.out.print("Prosze wpisac pin: ");

        Scanner inScanner = new Scanner(System.in);
        usersInput = inScanner.nextInt();

        if (card.checkPassCode(usersInput)) {

            System.out.println("[1] Wplata srodkow"
                    + "\n[2] Wyplata srodkow"
                    + "\n[3] Sprawdz saldo");

        } else {
            System.out.println("Niepoprawny kod PIN");
        }
    }
}
