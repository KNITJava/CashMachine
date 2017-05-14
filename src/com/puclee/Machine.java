package com.puclee;

/**
 * Created by PucLee on 10.05.2017.
 */
public class Machine {
    private String serialNumber;

    public Machine(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected void showSerialNumber(){
        System.out.println("Numer seryjny: "+serialNumber);
    }

    final void someMethod(){

    }
}
