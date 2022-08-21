package com.solvd.onlineShop.payment;

import com.solvd.onlineShop.Cart;
import com.solvd.onlineShop.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cash extends Payment {

    double reduction = 0.05;
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public Cash(double Amount, String type, double reduction) {
        super(Amount, type);
        this.reduction = reduction;
    }

    public Cash(double Amount, String type) {
        super(Amount, type);
    }

    public Cash() {

    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public void cashDiscount(Cart cart) {
        double discount = cart.getTotalPrice() * reduction;
        cart.setTotalPrice(cart.getTotalPrice() - discount);
        LOGGER.info("Purchased with Cash | Cash discount amount: " + discount + "$");
    }
}
