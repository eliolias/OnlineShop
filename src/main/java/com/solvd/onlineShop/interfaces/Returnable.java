package com.solvd.onlineShop.interfaces;

@FunctionalInterface
public interface Returnable<T> {
    boolean returnItem(T o);
}
