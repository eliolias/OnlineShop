package com.solvd.onlineShop.interfaces;

@FunctionalInterface
public interface Rewardable<T> {
    int earnPoints(T o);
}
