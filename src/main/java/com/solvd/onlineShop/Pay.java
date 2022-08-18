package com.solvd.onlineShop;

import com.solvd.onlineShop.payment.Payment;

public interface Pay {
    double tax = 0.189;

    void pay(Payment payment, Cart cart);
}
