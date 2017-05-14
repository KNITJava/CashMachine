package com.puclee;

public class BiletMachine extends Machine{
    private String type;

    public BiletMachine(String serialNumber, String type) {
        super(serialNumber);
        this.type = type;
    }

    @Override
    protected void showSerialNumber() {
        System.out.println("[BILETOMAT]");
        super.showSerialNumber();
    }

}
