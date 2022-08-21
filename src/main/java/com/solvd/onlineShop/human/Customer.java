package com.solvd.onlineShop.human;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.payment.Payment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Customer extends Human implements IPay, Rewardable {

    private final static Logger LOGGER = LogManager.getLogger(Customer.class);


    public Customer(String name, boolean isEmployee, List<String> sizes, int frequentShopperPoints) {
        super(name, true, frequentShopperPoints);
    }

    public Customer(String name, boolean isEmployee, List<String> sizes) {
        super(name, true);
    }

    public Customer(String name) {
        super(name);
        this.setEmployee(false);
    }

    public Customer() {
    }

    @Override
    public void pay(Payment payment, Cart cart) {
        if(payment.getAmount() > cart.getTotalPrice()){
            double taxes = cart.getTotalPrice() * tax;
            payment.setAmount(payment.getAmount() - (cart.getTotalPrice() + taxes));
            LOGGER.info("Customer" + this.getName() + "Remaining funds: " + payment.getAmount());
        }
        LOGGER.info("Insufficient funds");

    }

    @Override
    public int earnPoints(Cart cart) {
        int pointsToAdd = 0;
        for(Product product: cart.getCartProducts()){
            pointsToAdd++;
        }
        this.setshopperPoints(this.getshopperPoints() + pointsToAdd);
        return this.getshopperPoints();
    }
}
