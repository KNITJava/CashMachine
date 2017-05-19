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
                    + "\n[3] Sprawdz saldo"
                    + "\n[7] WYJSCIE");

            do {
                System.out.print("Decyzja: ");
                usersInput = inScanner.nextInt();

                switch (usersInput) {
                    case 1:
                        cashIn(card, inScanner);
                        break;
                    case 2:
                        cashOut(card, inScanner);
                        break;
                    case 3:
                        checkBalance(card);
                        break;
                    case 7:
                        System.out.println("Dziekujemy za skorzystanie z naszych uslug.");
                        break;
                    default:
                        System.out.println("Niepoprawny przycisk");
                }
            } while (usersInput != 7);

        } else {
            System.out.println("Niepoprawny kod PIN");
        }

        inScanner.close();
    }

    private void cashIn(Card card, Scanner inScanner) {
        int amount = 0;
        Account account = card.getOnwerAccount();

        System.out.print("Prosze wpisac kwote do wplaty: ");
        amount = inScanner.nextInt();
        account.cashIn(amount);

        System.out.print("Wplata zarejestrowana. ");
        checkBalance(card);

    }

    private void cashOut(Card card, Scanner inScanner) {
        int amount = 0;
        Account account = card.getOnwerAccount();

        System.out.print("Prosze wpisac kwote do wyplaty: ");
        amount = inScanner.nextInt();

        if (account.cashOut(amount))
            System.out.println("Transakcja przebiegla pomyslnie.");
        else
            System.out.println("Niewystarczajaca ilosc srodkow na koncie.");
        checkBalance(card);
    }

    private void checkBalance(Card card) {
        Account account = card.getOnwerAccount();
      /* System.out.println("Aktualne saldo wynosi: "+account.checkBalance());*/
        System.out.format("Aktualne saldo wynosi: %.2f%n", account.checkBalance());

    }
}
