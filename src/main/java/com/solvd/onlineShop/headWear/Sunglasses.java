package com.solvd.onlineShop.headWear;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.interfaces.Warrantable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sunglasses extends ClothingProduct implements Warrantable {

    private final static Logger LOGGER = LogManager.getLogger(Sunglasses.class);


    private Boolean isPolarized;

    public Sunglasses(String name, int sku, double price, Category category, Sizes size, String color, String type, Boolean isPolarized) {
        super(name, sku, price, category, size, color, type);

        this.isPolarized = isPolarized;
    }

    public Sunglasses() {
    }

    public Boolean getPolarized() {
        return isPolarized;
    }

    public void setPolarized(Boolean polarized) {
        isPolarized = polarized;
    }

    @Override
    public double warrantyPrice() {
        double price = warrantyPrice * this.getPrice();
        return price;
    }

    public void addWarranty(){
        LOGGER.info("Sunglasses Warranty purchased for: " + warrantyPrice());
        this.setPrice(this.getPrice() + warrantyPrice());
    }

    @Override
    public String warrantyPolicy() {
        LOGGER.info("Warranty on sunglasses covers scratches, breaks, and loss of sunglasses as long as un-intentional.");
        return null;
    }
}
