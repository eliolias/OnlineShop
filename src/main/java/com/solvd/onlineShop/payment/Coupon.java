package com.solvd.onlineShop.payment;

public class Coupon extends Payment {
    private boolean isPercent;

    public Coupon(double Amount, String type, boolean isPercent) {
        super(Amount, type);
        this.isPercent = isPercent;
    }

    public boolean isPercent() {
        return isPercent;
    }

    public void setPercent(boolean percent) {
        isPercent = percent;
    }
}
