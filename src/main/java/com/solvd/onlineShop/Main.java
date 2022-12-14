package com.solvd.onlineShop;

import com.solvd.onlineShop.Clothing;
import com.solvd.onlineShop.Shop;
import com.solvd.onlineShop.bottom.Bottom;
import com.solvd.onlineShop.bottom.Pants;
import com.solvd.onlineShop.bottom.Shorts;
import com.solvd.onlineShop.human.Employee;
import com.solvd.onlineShop.payment.Cash;
import com.solvd.onlineShop.payment.Coupon;
import com.solvd.onlineShop.headWear.Hat;
import com.solvd.onlineShop.headWear.HeadWear;
import com.solvd.onlineShop.headWear.Sunglasses;
import com.solvd.onlineShop.top.SweatShirt;
import com.solvd.onlineShop.top.TShirt;
import com.solvd.onlineShop.top.Top;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Online Shop");
        Clothing clothing = new Clothing("Clothing", "Summer");
        Top top = new Top("Tops");
        Bottom bottom = new Bottom("Bottoms");
        HeadWear headWear = new HeadWear("HeadWear");
        TShirt greenTShirt = new TShirt("Green T-Shirt", 11111, 8.99, top, "M", "Green");
        TShirt brownTShirt = new TShirt("Brown T-Shirt", 11112, 8.99, top, "L", "Brown");
        SweatShirt hoodie = new SweatShirt("Black Hoodie", 11113, 20.99, top, "L", "Black", true);
        SweatShirt knitSweater = new SweatShirt("Knitted Sweater", 11114, 39.99, top, "S", "Gray", false);
        Pants cargoPants = new Pants("Cargo Pants", 11115, 29.99, bottom, "M", "Tan", "Work Pants");
        Pants jeans = new Pants("Blue Jeans", 11116, 25.99, bottom, "S", "Blue", "Jeans");
        Shorts cargoShorts = new Shorts("Cargo Shorts", 11117, 18.99, bottom, "M", "Dark Green", false);
        Shorts swimTrunks = new Shorts("Swimming Shorts", 11118, 12.99, bottom, "L", "Purple", true);
        Hat yankeeHat = new Hat("Yankees Hat", 11119, 15.99, headWear, "L", "Blue & White", "Baseball Hat");
        Hat beenie = new Hat("Beenie", 11120, 9.99, headWear, "L", "Burgundy", "Cuffed Beenie");
        Sunglasses aviators = new Sunglasses("Aviator SunGlasses", 11121, 50.99, headWear, "M", "Gold & Silver", "Aviator", true);
        Sunglasses clubMasters = new Sunglasses("ClubMaster SunGlasses", 11122, 21.99, headWear, "L", "Black", "ClubMaster", false);

        Employee bob = new Employee("bob");
        Cart bobCart = new Cart();
        Cash bobCash = new Cash(500, "Cash");
        Coupon bobCoupon = new Coupon(.25, "Coupon", true);

        List<Product> clothingTopProducts = new ArrayList<>(Arrays.asList(greenTShirt, brownTShirt, hoodie, knitSweater));
        List<Product> clothingBottomProducts = new ArrayList<>(Arrays.asList(cargoPants, jeans, cargoShorts, swimTrunks));
        List<Product> clothingHeadWearProducts = new ArrayList<>(Arrays.asList(yankeeHat, beenie, clubMasters, aviators));
        List<Product> customerWishList = new ArrayList<>(Arrays.asList(greenTShirt, hoodie, knitSweater, jeans, swimTrunks, beenie, aviators, clubMasters));
        List<Clothing> shopCategories = new ArrayList<>(Arrays.asList(clothing));
        List<Clothing> clothingCategories = new ArrayList<>(Arrays.asList(top, bottom, headWear));
        List<Product> allProducts = new ArrayList<>();
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

        System.out.println("Welcome to " + shop.getName());
        System.out.println("Available product categories: " + shop.getCategories());
        System.out.println("Available clothing product categories: " + clothing.getClothingCategories());
        System.out.println("Products available in " + clothing.getName() + " category :" + clothing.getProducts());
        System.out.println(bob.getName() + "'s wishlist: " + bob.getWishList());
        bobCart.addWishListToCart(bob.getWishList());
        bobCart.aggregateTotalPrice();
        System.out.println("Cart total Price: " + bobCart.getTotalPrice() + "$");
        bobCart.applyEmployeeDiscount(bob.isEmployee());
        bobCart.checkCart(bobCart.getCartProducts());
        bobCart.checkCoupon(bobCoupon);
        bobCart.applyCoupon(bobCoupon);
        System.out.println("----------");
        System.out.println("Products in cart: " + bobCart.getCartProducts());
        System.out.println("Cart total Price with discounts: " + bobCart.getTotalPrice() + "$");
        System.out.println("----------");

        System.out.println(bob.getName() + " purchased : " + bobCart.makePurchase(bobCash) + " for " + bobCart.getTotalPrice() + "$");
        System.out.println("----------");
        System.out.println("Cash left: " + bobCash.getAmount());

    }


}
