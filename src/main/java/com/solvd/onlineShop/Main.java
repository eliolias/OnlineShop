package com.solvd.onlineShop;

import static com.solvd.onlineShop.Clothing.clothing;
import static com.solvd.onlineShop.Shop.shop;
import static com.solvd.onlineShop.Shop.shopCategories;
import static com.solvd.onlineShop.utils.ShopUtils.*;

import com.solvd.onlineShop.threads.BottomRunnable;
import com.solvd.onlineShop.threads.HeadWearRunnable;
import com.solvd.onlineShop.threads.TopRunnable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        TopRunnable runnable1 = new TopRunnable();
        BottomRunnable runnable2 = new BottomRunnable();
        HeadWearRunnable runnable3 = new HeadWearRunnable();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        thread1.start();
        thread2.start();
        thread3.start();

        bobCart.checkWishList(customerWishList);
        bob.setWishList(customerWishList);
        shop.checkCategories(shopCategories);
        clothing.checkCategories(clothingCategories);
        clothing.setClothingCategories(clothingCategories);
        clothing.setProducts(allProducts);
        shop.addCategory(clothing);

        LOGGER.info("Welcome to " + shop.getName());
        LOGGER.info("Available product categories: " + shop.getCategories());
        LOGGER.info("Available clothing product categories: " + clothing.getClothingCategories());
        LOGGER.info("Products available in " + clothing.getName() + " category :" + clothing.getProducts());
        LOGGER.info(bob.getName() + "'s wishlist: " + bob.getWishList());
        bobCart.addWishListToCart2(bob.getWishList());
        bobCart.aggregateTotalPrice();
        LOGGER.info("Cart total Price: " + bobCart.getTotalPrice() + "$");
        bobCart.applyEmployeeDiscount(bob.isEmployee());
        bobCart.checkCart(bobCart.getCartProducts());
        bobCart.checkCoupon(bobCoupon);
        bobCart.applyCoupon(bobCoupon);
        LOGGER.info("----------");
        LOGGER.info("Products in cart: " + bobCart.getCartProducts());
        LOGGER.info("Cart total Price with discounts: " + bobCart.getTotalPrice() + "$");
        LOGGER.info("----------");
        LOGGER.info(bob.getName() + " purchased : " + bobCart.makePurchaseCart(bobCash) + " for " + bobCart.getTotalPrice() + "$");
        bob.earnPoints.earnPoints(bobCart);
        bob.pay.pay(bobCash, bobCart);

        //Testing returnable interface
        //customerWishList.forEach(clothingProduct -> clothingProduct.returnItem.returnItem(clothingProduct));


    }
}
