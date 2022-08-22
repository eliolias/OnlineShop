package com.solvd.onlineShop.interfaces;

import com.solvd.onlineShop.Cart;
import com.solvd.onlineShop.payment.Payment;

public interface IPay {
    double tax = 0.189;

    void pay(Payment payment, Cart cart);
}
