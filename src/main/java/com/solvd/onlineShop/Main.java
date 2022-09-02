package com.solvd.onlineShop;

import static com.solvd.onlineShop.Cart.cart;
import static com.solvd.onlineShop.Clothing.getClothing;
import static com.solvd.onlineShop.Shop.*;
import static com.solvd.onlineShop.human.Employee.employee;
import static com.solvd.onlineShop.payment.Cash.cash;
import static com.solvd.onlineShop.payment.Coupon.coupon;
import static com.solvd.onlineShop.utils.ShopUtils.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        generateShop();
        getClothing().setClothingCategories(getClothingCategories());
        getClothing().checkCategories(getClothing().getClothingCategories());
        getShop().addCategory(getClothing());

        cart.checkWishList(getGeneratedWishList());
        employee.setWishList(getGeneratedWishList());
        LOGGER.info("Welcome to " + getShop().getName());
        LOGGER.info("Available product categories: " + getShop().getCategories());
        LOGGER.info("Available clothing product categories: " + getClothing().getClothingCategories());
        LOGGER.info("Products available in " + getClothing().getName() + " category :" + getAllProducts());
        LOGGER.info(employee.getName() + "'s wishlist: " + employee.getWishList());
        cart.addWishListToCart(employee.getWishList());
        cart.aggregateTotalPrice();
        LOGGER.info("Cart total Price: " + cart.getTotalPrice() + "$");
        cart.applyEmployeeDiscount(employee.isEmployee());
        cart.checkCart(cart.getCartProducts());
        cart.checkCoupon(coupon);
        coupon.setDiscountType(coupon);
        cart.applyCoupon(coupon);
        LOGGER.info("----------");
        LOGGER.info("Products in cart: " + cart.getCartProducts());
        LOGGER.info("Cart total Price with discounts: " + cart.getTotalPrice() + "$");
        LOGGER.info("----------");
        LOGGER.info(employee.getName() + " purchased : " + cart.makePurchaseCart(cash) + " for " + cart.getTotalPrice() + "$");
        employee.earnPoints.earnPoints(cart);
        employee.pay.pay(cash, cart);

        getGeneratedWishList().forEach(clothingProduct -> clothingProduct.returnItem.returnItem(clothingProduct));
    }
}
