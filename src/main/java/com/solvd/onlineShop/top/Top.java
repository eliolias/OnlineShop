package com.solvd.onlineShop.top;

import com.solvd.onlineShop.Clothing;
import com.solvd.onlineShop.Product;

import java.util.ArrayList;
import java.util.List;

public class Top extends Clothing {
    private List<String> topTypes = new ArrayList<>();

    public Top(String name, List<Product> products, List<String> topTypes) {
        super(name, products);
        this.topTypes = topTypes;
    }
    public Top(String name, List<Product> products) {
        super(name, products);
    }

    public Top(String name) {
        super(name);
    }

    public Top() {
    }

    public List<String> getTopTypes() {
        return topTypes;
    }

    public void setTopTypes(List<String> topTypes) {
        this.topTypes = topTypes;
    }
}

