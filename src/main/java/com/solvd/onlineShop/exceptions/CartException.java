package com.solvd.onlineShop.exceptions;

public class CartException extends RuntimeException {
    CartException(String message) {
        super(message);
    }
}
