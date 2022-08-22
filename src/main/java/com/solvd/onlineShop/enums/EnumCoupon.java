package com.solvd.onlineShop.enums;

public enum EnumCoupon {
    TENPERCENT (.10),
    TWENTYPERCENT (.20),
    THIRTYPERCENT (.30),
    FIFTYPERCENT (.50),
    TENDOLLARS (10),
    TWENTYDOLLARS (20),
    THIRTYDOLLARS (30),
    FIFTYDOLLARS (50);
    private final double amount;
    EnumCoupon(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
