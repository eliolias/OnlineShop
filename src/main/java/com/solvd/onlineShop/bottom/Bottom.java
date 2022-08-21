package com.solvd.onlineShop.bottom;

import com.solvd.onlineShop.Clothing;
import com.solvd.onlineShop.Product;

import java.util.*;

public class Bottom extends Clothing {

    private List<String> bottomTypes = new ArrayList<>();

    public Bottom(String name, List<Product> products, List<String> bottomTypes) {
        super(name, products);
        this.bottomTypes = bottomTypes;
    }

    public Bottom(String name, List<Product> products) {
        super(name, products);
    }

    public Bottom(String name) {
        super(name);
    }

    public Bottom() {
    }

    public List<String> getBottomTypes() {
        return bottomTypes;
    }

    public void setBottomTypes(List<String> bottomTypes) {
        this.bottomTypes = bottomTypes;
    }
}