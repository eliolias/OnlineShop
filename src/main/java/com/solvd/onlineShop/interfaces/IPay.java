package com.solvd.onlineShop.interfaces;


@FunctionalInterface
public interface IPay<T, U> {
    void pay(T o, U o2);

}
