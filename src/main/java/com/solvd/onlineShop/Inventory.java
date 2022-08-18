package com.solvd.onlineShop;

public interface Inventory {

    int addInventory(int invToAdd, Shop shop);

    int subtractInventory(Shop shop);
}
