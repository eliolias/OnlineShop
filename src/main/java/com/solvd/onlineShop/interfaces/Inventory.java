package com.solvd.onlineShop.interfaces;

import com.solvd.onlineShop.Shop;

public interface Inventory {

    int addInventory(int invToAdd, Shop shop);

    int subtractInventory(Shop shop);
}
