package com.solvd.onlineShop;

public enum EnumCoupon {
    TEN (.10),
    TWENTY (.20),
    THIRTY (.30),
    FIFTY (.50);

    private final double percent;
    EnumCoupon(double percent){
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }
}
