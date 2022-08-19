package com.solvd.onlineShop.bottom;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.SeasonDiscountable;

public class Shorts extends ClothingProduct implements SeasonDiscountable {
    boolean forSwimming;

    public Shorts(String name, int sku, double price, Category category, String size, String color, String type, boolean forSwimming) {
        super(name, sku, price, category, size, color, type);
        this.forSwimming = forSwimming;
    }

    public Shorts() {
    }


    public boolean isForSwimming() {
        return forSwimming;
    }

    public void setForSwimming(boolean forSwimming) {
        this.forSwimming = forSwimming;
    }

    //This should probably not be implemented here
    @Override
    public void inSeasonDiscount() {
        if(this.getCategory().getCurrentSeason() == season){
            this.setPrice(this.getPrice() - discount);
            System.out.println("In season discount for summer of 10$");
        }
    }
}
