package com.solvd.onlineShop.bottom;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;


public class Pants extends ClothingProduct {

    public Pants(String name, int sku, double price, Category category, String size, String color, String type) {
        super(name, sku, price, category, size, color, type);

    }

    public Pants() {
    }

}
