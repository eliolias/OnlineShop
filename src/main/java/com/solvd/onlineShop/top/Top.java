package com.solvd.onlineShop.top;

import com.solvd.onlineShop.Clothing;
import com.solvd.onlineShop.Product;

import java.util.List;

public class Top extends Clothing {
    public Top(String name, List<Product> products) {
        super(name, products);
    }

    public Top(String name) {
        super(name);
    }

    public Top() {
    }

}

