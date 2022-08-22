package com.solvd.onlineShop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static com.solvd.onlineShop.utils.bottomUtils.*;
import static com.solvd.onlineShop.utils.headWearUtils.*;
import static com.solvd.onlineShop.utils.shopUtils.*;
import static com.solvd.onlineShop.utils.topUtils.*;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        top.setTopTypes(topCategories);
        bottom.setBottomTypes(bottomCategories);
        headWear.setHeadWearTypes(headWearCategories);
        allProducts.addAll(clothingTopProducts);
        allProducts.addAll(clothingBottomProducts);
        allProducts.addAll(clothingHeadWearProducts);
        shop.checkCategories(shopCategories);
        clothing.checkCategories(clothingCategories);
        clothing.setProducts(allProducts);
        clothing.setClothingCategories(clothingCategories);
        shop.addCategory(clothing);
        bobCart.checkWishList(customerWishList);
        bob.setWishList(customerWishList);


        LOGGER.info("Welcome to " + shop.getName());
        LOGGER.info("Available product categories: " + shop.getCategories());
        LOGGER.info("Available clothing product categories: " + clothing.getClothingCategories());
        LOGGER.info("Products available in " + clothing.getName() + " category :" + clothing.getProducts());
        LOGGER.info(bob.getName() + "'s wishlist: " + bob.getWishList());
        bobCart.addWishListToCart(bob.getWishList());
        bobCart.aggregateTotalPrice();
        LOGGER.info("Cart total Price: " + bobCart.getTotalPrice() + "$");
        bobCart.applyEmployeeDiscount(bob.isEmployee());
        bobCart.checkCart(bobCart.getCartProducts());
        bobCart.checkCoupon(bobCoupon);
        bobCart.applyCoupon(bobCoupon);
        LOGGER.info("----------");
        bobCart.sortCart();
        LOGGER.info("Products in cart: " + bobCart.getSortedCartProducts());
        LOGGER.info("Cart total Price with discounts: " + bobCart.getTotalPrice() + "$");
        LOGGER.info("----------");
        LOGGER.info(bob.getName() + " purchased : " + bobCart.makePurchaseCart(bobCash) + " for " + bobCart.getTotalPrice() + "$");
        LOGGER.info("----------");
        LOGGER.info("Cash left: " + bobCash.getAmount());


    }


}
