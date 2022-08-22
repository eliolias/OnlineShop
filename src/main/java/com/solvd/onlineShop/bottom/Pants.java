package com.solvd.onlineShop.bottom;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;


public class Pants extends ClothingProduct {

    public Pants(String name, int sku, double price, Category category, Sizes size, String color, String type) {
        super(name, sku, price, category, size, color, type);

    }

    public Pants() {
    }

}
