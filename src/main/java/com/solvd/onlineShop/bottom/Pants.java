package com.solvd.onlineShop.bottom;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;


public class Pants extends ClothingProduct {

    private boolean beltRecommended;

    public Pants(String name, int sku, double price, Category category, Sizes size, String color, String type, boolean beltRecommended) {
        super(name, sku, price, category, size, color, type);
              this.beltRecommended = beltRecommended;

    }

    public Pants() {
    }

    public boolean isBeltRecommended() {
        return beltRecommended;
    }

    public void setBeltRecommended(boolean beltRecommended) {
        this.beltRecommended = beltRecommended;
    }
}
