package com.solvd.onlineShop.human;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.interfaces.IPay;
import com.solvd.onlineShop.interfaces.Rewardable;
import com.solvd.onlineShop.payment.Payment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static com.solvd.onlineShop.utils.ShopUtils.randomHumanName;

public class Employee extends Human {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static final Employee employee = new Employee(randomHumanName());
    private double ratePerItem;
    private double totalPay;

    public Employee(String name, boolean isEmployee, List<String> sizes, int frequentShopperPoints) {
        super(name, true, frequentShopperPoints);
    }

    public Employee(String name, boolean isEmployee, double totalPay, List<String> sizes) {
        super(name, true);
        this.totalPay = totalPay;
        ratePerItem = 2.5;
    }

    public Employee(String name) {
        super(name);
        this.setEmployee(true);
    }

    public Employee() {

    }


    public double getRatePerItem() {
        return ratePerItem;
    }

    public void setRatePerItem(double ratePerItem) {
        this.ratePerItem = ratePerItem;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public Rewardable<Cart> earnPoints = ((Cart cart) -> {
        int pointsToAdd = 0;
        pointsToAdd += cart.getCartProducts().size();
        this.setShopperPoints(this.getShopperPoints() + pointsToAdd);
        LOGGER.info("Shopper reward points received: " + this.getShopperPoints()  + " points");
        return this.getShopperPoints();
    });

    public IPay<Payment, Cart> pay = ((Payment payment, Cart cart) -> {
        if (payment.getAmount() > cart.getTotalPrice()) {
            double taxes = cart.getTotalPrice() * 0.185;
            payment.setAmount(payment.getAmount() - (cart.getTotalPrice() + taxes));
            LOGGER.info("Taxes on purchase: +$" + taxes);
            LOGGER.info("Employee " + this.getName() + " remaining funds: $" + payment.getAmount());
        } else {
            LOGGER.info("Insufficient funds");
        }
    });
}
