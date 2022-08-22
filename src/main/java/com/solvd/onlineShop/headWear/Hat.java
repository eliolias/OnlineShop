package com.solvd.onlineShop.headWear;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;;

public class Hat extends ClothingProduct{

    private boolean hasBrim;

    public Hat(String name, int sku, double price, Category category, Sizes size, String color, String type, boolean hasBrim) {
        super(name, sku, price, category, size, color, type);
        this.hasBrim = hasBrim;

    }

    public Hat() {
    }

    public boolean isHasBrim() {
        return hasBrim;
    }

    public void setHasBrim(boolean hasBrim) {
        this.hasBrim = hasBrim;
    }
}
