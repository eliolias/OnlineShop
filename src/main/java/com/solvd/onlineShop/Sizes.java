package com.solvd.onlineShop;

public enum Sizes {
    S ("Small"),
    M ("Medium"),
    L ("Large"),
    XL ("Extra Large"),
    XXL ("Extra Extra Large");

    private final String size;

    Sizes(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
