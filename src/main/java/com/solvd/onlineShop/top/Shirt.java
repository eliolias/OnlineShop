package com.solvd.onlineShop.top;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.interfaces.SeasonDiscountable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Shirt extends ClothingProduct implements SeasonDiscountable {

    private boolean hasSleeves;
    private final static Logger LOGGER = LogManager.getLogger(Main.class);


    public Shirt(String name, int sku, double price, Category category, Sizes size, String color, String type, boolean hasSleeves) {
        super(name, sku, price, category, size, color, type);
        this.hasSleeves = hasSleeves;
    }

    public Shirt() {
    }

    public boolean getHasSleeves() {
        return hasSleeves;
    }

    public void setHasSleeves(boolean hasSleeves) {
        this.hasSleeves = hasSleeves;
    }

    @Override
    public void inSeasonDiscount() {
        if (this.getCategory().getCurrentSeason() == season) {
            this.setPrice(this.getPrice() - discount);
            LOGGER.info("In season discount for summer of 10$");
        }
    }
}
