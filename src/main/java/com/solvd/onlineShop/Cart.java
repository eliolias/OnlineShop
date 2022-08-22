package com.solvd.onlineShop;

import com.solvd.onlineShop.exceptions.CartException;
import com.solvd.onlineShop.exceptions.CouponException;
import com.solvd.onlineShop.exceptions.WishListException;
import com.solvd.onlineShop.interfaces.Inventory;
import com.solvd.onlineShop.payment.Cash;
import com.solvd.onlineShop.payment.Coupon;
import com.solvd.onlineShop.payment.Payment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Cart implements Inventory {

    private final static Logger LOGGER = LogManager.getLogger(Cart.class);
    private HashMap<String, Double> cartProducts = new HashMap<String, Double>();
    private SortedMap<String, Double> sortedCartProducts = new TreeMap<String, Double>();
    private double totalPrice;

    public Cart(HashMap<String, Double> cartProducts, int totalPrice) {
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


    public HashMap<String, Double> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(HashMap<String, Double> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public SortedMap<String, Double> getSortedCartProducts() {
        return sortedCartProducts;
    }

    public void setSortedCartProducts(SortedMap<String, Double> sortedCartProducts) {
        this.sortedCartProducts = sortedCartProducts;
    }

    public void aggregateTotalPrice() {
        for (double i : cartProducts.values()) {
            totalPrice += i;
        }
    }

    public void addToCart(Product product) {
        cartProducts.put(product.getName(), product.getPrice());
    }


    public List<String> makePurchaseCart(Payment payment) {
        List<String> productsPurchased = new ArrayList<>();
        cartProducts.forEach((key, value) -> productsPurchased.add(key + "-" + value + "$"));
        if (payment.getType().equals("Cash")) {
            Cash cash = new Cash();
            cash.setAmount(payment.getAmount());
            cash.cashDiscount(this);
        }
        payment.setAmount(payment.getAmount() - getTotalPrice());
        return productsPurchased;
    }

    public void addWishListToCart(List<ClothingProduct> wishlist) {
        List<String> addedToHashCart = new ArrayList<>();
        for (Product product : wishlist) {
            product.checkProduct(product);
            int sku = product.getSku();
            if (sku >= 11111 && sku <= 11122) {
                this.addToCart(product);
                addedToHashCart.add(product.getName());
            } else {
                LOGGER.info("No matching items found.");
            }
        }
        if (addedToHashCart.size() != 0) {
            LOGGER.info("Added items from wishlist to cart: " + addedToHashCart);
        }
    }

    //this refactor with forEach is not working properly
    public void addWishListToCart2(List<ClothingProduct> wishlist) {
        List<String> addedToHashCart = new ArrayList<>();
        wishlist.forEach(product -> {
            if (product.checkProduct(product)) {
                int sku = product.getSku();
                if(sku >= 11111 && sku <= 11122){
                    this.addToCart(product);
                    addedToHashCart.add(product.getName());
                }
            } else {
                LOGGER.info("No matching items found");
            }
            if (addedToHashCart.size() != 0) {
                LOGGER.info("Added items from wishlist to cart: " + addedToHashCart);
            }
        });
    }
    public void checkCart(HashMap<String, Double> cartProducts) {
        if (cartProducts == null || cartProducts.isEmpty()) {
            throw new CartException("Invalid cart. Cart is empty.");
        }
        LOGGER.info("Valid Cart.");
    }

    public void checkWishList(List<ClothingProduct> wishList) {
        if (wishList.isEmpty()) {
            throw new WishListException("Invalid Wishlist. Wishlist is empty.");
        }
        LOGGER.info("Valid Wishlist.");
    }


    public void applyCoupon(Coupon coupon) {
        if (coupon.isPercent()) {
            double discount = totalPrice * coupon.getCouponAmount();
            totalPrice -= discount;
            LOGGER.info("Coupon: " + (coupon.getCouponAmount() * 100) + "% off price | Coupon discount amount: " + discount + "$");
        } else {
            totalPrice -= coupon.getCouponAmount();
            LOGGER.info("Coupon discount amount: " + coupon.getCouponAmount() + "$");
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
    //Sorting alphabetically for now, may change to by price later
    public void sortCart(){
        sortedCartProducts.putAll(cartProducts);
    }

    @Override
    public int addInventory(int invToAdd, Shop shop) {
        shop.setInventory(shop.getInventory() + invToAdd);
        return shop.getInventory();
    }

    @Override
    public int subtractInventory(Shop shop) {
        shop.setInventory(shop.getInventory() - cartProducts.size());
        return shop.getInventory();
    }
}



