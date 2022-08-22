package com.solvd.onlineShop.payment;

import com.solvd.onlineShop.enums.EnumCoupon;

public class Coupon extends Payment {
    private boolean isPercent;
    private EnumCoupon couponAmount;
    public Coupon(EnumCoupon couponAmount, String type, boolean isPercent) {
        super(type);
        this.isPercent = isPercent;
        this.couponAmount = couponAmount;
    }

    public boolean isPercent() {
        return isPercent;
    }

    public void setPercent(boolean percent) {
        isPercent = percent;
    }

    public double getCouponAmount() {
        return couponAmount.getAmount();
    }

    public void setCouponAmount(EnumCoupon couponAmount) {
        this.couponAmount = couponAmount;
    }
}
