package com.solvd.onlineShop.payment;

import com.solvd.onlineShop.enums.EnumCoupon;

import static com.solvd.onlineShop.utils.ShopUtils.randomCoupon;

public class Coupon extends Payment {

    public static Coupon coupon = new Coupon(randomCoupon(), "Coupon", true);
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

    //Testing with this method to attempt to fix coupon
    public void setDiscountType(Coupon coupon) {
        if (coupon.getAmount() < 1) {
            coupon.setPercent(false);
        } else if (coupon.getAmount() < 1) {
            coupon.setPercent(true);
        }
    }
}
