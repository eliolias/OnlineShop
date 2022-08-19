package com.solvd.onlineShop.top;

import com.solvd.onlineShop.*;

public class TShirt extends ClothingProduct implements SeasonDiscountable {


    public TShirt(String name, int sku, double price, Category category, String size, String color, String type) {
        super(name, sku, price, category, size, color, type);

    }

    public TShirt() {
    }

    @Override
    public void inSeasonDiscount() {
        if(this.getCategory().getCurrentSeason() == season){
            this.setPrice(this.getPrice() - discount);
            System.out.println("In season discount for summer of 10$");
        }
    }
}
