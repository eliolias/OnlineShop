package com.solvd.onlineShop.payment;

import com.solvd.onlineShop.Cart;
import com.solvd.onlineShop.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.solvd.onlineShop.utils.ShopUtils.getRandomNumber;

public class Card extends Payment {
    public static Card card = new Card(getRandomNumber(1000, 5000), "Card");
    private double fee = 0.025;
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public Card(double Amount, String type, double fee) {
        super(Amount, type);
        this.fee = fee;
    }

    public Card(double Amount, String type) {
        super(Amount, type);
    }

    public Card() {

    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void cardFee(Cart cart){
        double upCharge = cart.getTotalPrice() * fee;
        cart.setTotalPrice(cart.getTotalPrice() + upCharge);
        LOGGER.info("Purchased with Card | Card upcharge amount: " + upCharge + "$");
    }
}
