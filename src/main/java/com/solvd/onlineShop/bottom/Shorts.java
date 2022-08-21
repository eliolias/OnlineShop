package com.solvd.onlineShop.bottom;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.Main;
import com.solvd.onlineShop.SeasonDiscountable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Shorts extends ClothingProduct implements SeasonDiscountable {

    private final static Logger LOGGER = LogManager.getLogger(Shorts.class);
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
            LOGGER.info("In season discount for summer of 10$");
        }
    }
}
