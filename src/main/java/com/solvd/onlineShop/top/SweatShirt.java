package com.solvd.onlineShop.top;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;

public class SweatShirt extends ClothingProduct {

    private boolean hasHood;

    public SweatShirt(String name, int sku, double price, Category category, Sizes size, String color, String type, Boolean hasHood) {
        super(name, sku, price, category, size, color, type);

        this.hasHood = hasHood;
    }

    public SweatShirt() {
    }


    public Boolean getHasHood() {
        return hasHood;
    }

    public void setHasHood(Boolean hasHood) {
        this.hasHood = hasHood;
    }
}