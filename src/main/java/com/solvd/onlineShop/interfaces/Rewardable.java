package com.solvd.onlineShop.interfaces;

import com.solvd.onlineShop.Cart;

public interface Rewardable {
    int employeeMultiplier = 2;

    int earnPoints(Cart cart);
}
