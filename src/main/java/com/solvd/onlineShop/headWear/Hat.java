package com.solvd.onlineShop.headWear;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;;

public class Hat extends ClothingProduct{


    public Hat(String name, int sku, double price, Category category, Sizes size, String color, String type) {
        super(name, sku, price, category, size, color, type);

    }

    public Hat() {
    }


}
