package com.solvd.onlineShop.payment;

public abstract class Payment {
    private double Amount;
    private String type;
    private boolean isCash;

    public Payment(double Amount, String type, boolean isCash) {
        this.Amount = Amount;
        this.type = type;
        this.isCash = isCash;
    }

    public Payment(double Amount, String type) {
        this.Amount = Amount;
        this.type = type;
    }

    public Payment(String type) {
        this.type = type;
    }

    public Payment() {

    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        this.Amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCash() {
        return isCash;
    }

    public void setCash(boolean cash) {
        isCash = cash;
    }
}
