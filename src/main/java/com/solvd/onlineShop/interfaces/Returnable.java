package com.solvd.onlineShop.interfaces;

@FunctionalInterface
public interface Returnable<T> {
    void returnItem(T o);
}
