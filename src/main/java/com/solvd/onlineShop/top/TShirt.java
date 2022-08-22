package com.solvd.onlineShop.top;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.interfaces.SeasonDiscountable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TShirt extends ClothingProduct implements SeasonDiscountable {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);


    public TShirt(String name, int sku, double price, Category category, Sizes size, String color, String type) {
        super(name, sku, price, category, size, color, type);

    }

    public TShirt() {
    }

    @Override
    public void inSeasonDiscount() {
        if(this.getCategory().getCurrentSeason() == season){
            this.setPrice(this.getPrice() - discount);
            LOGGER.info("In season discount for summer of 10$");
        }
    }
}
