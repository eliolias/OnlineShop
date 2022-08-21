package com.solvd.onlineShop;

import com.solvd.onlineShop.payment.Cash;
import com.solvd.onlineShop.payment.Coupon;
import com.solvd.onlineShop.payment.Payment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Cart implements Inventory {

    private final static Logger LOGGER = LogManager.getLogger(Cart.class);
    private List<Product> cartProducts = new ArrayList<>();
    private double totalPrice;

    public Cart(List<Product> cartProducts, int totalPrice) {
        this.cartProducts = cartProducts;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public void aggregateTotalPrice() {
        for (Product product : cartProducts) {
            totalPrice += product.getPrice();
        }
    }

    public void addToCart(Product product) {
        cartProducts.add(product);
    }


    public void removeFromCart(Product product) {
        cartProducts.remove(product);
    }


    public List<String> makePurchase(Payment payment) {
        List<String> productsPurchased = new ArrayList<>();
        for (Product product : cartProducts) {
            productsPurchased.add(product.getName() + "-" + product.getPrice() + "$");
        }
        if (payment.getType().equals("Cash")) {
            Cash cash = new Cash();
            cash.setAmount(payment.getAmount());
            cash.cashDiscount(this);
        }
        payment.setAmount(payment.getAmount() - getTotalPrice());
        return productsPurchased;
    }

    //Need to refactor this, many methods need to moved to soon to be created Order Class.
    public void addWishListToCart(List<ClothingProduct> wishlist) {
        List<String> addedToCart = new ArrayList<>();
        for (Product product : wishlist) {
            product.checkProduct(product);
            int sku = product.getSku();
            if (sku == 11111 || sku == 11112 || sku == 11113 || sku == 11114 || sku == 11115 || sku == 11116 || sku == 11117 || sku == 11118 || sku == 11119 || sku == 11120 || sku == 11121 || sku == 11122) {
                this.addToCart(product);
                addedToCart.add(product.getName());
            } else {
                LOGGER.info("No matching items found.");
            }
        }
        if (addedToCart.size() != 0) {
            LOGGER.info("Added items from wishlist to cart: " + addedToCart);
        }
    }

    public void checkCart(List<Product> cartProducts) {
        if(cartProducts == null || cartProducts.isEmpty()){
            throw new CartException("Invalid cart. Cart is empty.");
        }
        LOGGER.info("Valid Cart.");
    }

    public void checkWishList(List<ClothingProduct> wishList) {
        if(wishList.isEmpty()){
            throw new WishListException("Invalid Wishlist. Wishlist is empty.");
        }
        LOGGER.info("Valid Wishlist.");
    }


    public void applyCoupon(Coupon coupon) {
        if (coupon.isPercent()) {
            double discount = totalPrice * coupon.getAmount();
            totalPrice -= discount;
            LOGGER.info("Coupon: " + (coupon.getAmount() * 100) + "% off price | Coupon discount amount: " + discount + "$");
        } else {
            totalPrice -= coupon.getAmount();
            LOGGER.info("Coupon discount amount: " + coupon.getAmount() + "$");
        }
    }

    public void checkCoupon(Coupon coupon) {
        if (coupon.isPercent()) {
            if (coupon.getAmount() > 0.99) {
                throw new CouponException("Invalid Coupon");
            }
            LOGGER.info("Valid Coupon");
        } else {
            if (coupon.getAmount() > 100) {
                throw new CouponException("Invalid Coupon");
            }
            LOGGER.info("Valid Coupon");
        }
    }

    public void applyEmployeeDiscount(boolean isEmployee) {
        if (isEmployee) {
            double discount = totalPrice * 0.20;
            totalPrice -= discount;
            LOGGER.info("Employee discount: " + discount + "$");
        }
    }

/*    public void cashDiscount() {
        double discount = totalPrice * 0.05;
        totalPrice -= discount;
        LOGGER.info("Purchased with Cash | Cash discount amount: " + discount + "$");
    }*/

    @Override
    public int addInventory(int invToAdd, Shop shop) {
        shop.setInventory(shop.getInventory() + invToAdd);
        return shop.getInventory();
    }

    @Override
    public int subtractInventory(Shop shop) {
        for (Product product : cartProducts) {
            shop.setInventory(shop.getInventory() - 1);
        }
        return shop.getInventory();
    }
}



