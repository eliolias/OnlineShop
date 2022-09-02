package com.solvd.onlineShop.utils;

import com.solvd.onlineShop.*;

import com.solvd.onlineShop.bottom.Pants;
import com.solvd.onlineShop.bottom.Shorts;
import com.solvd.onlineShop.enums.EnumCoupon;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.headWear.Hat;

import com.solvd.onlineShop.headWear.Sunglasses;
import com.solvd.onlineShop.threads.BottomRunnable;
import com.solvd.onlineShop.threads.HeadWearRunnable;
import com.solvd.onlineShop.threads.OrderRunnable;
import com.solvd.onlineShop.threads.TopRunnable;
import com.solvd.onlineShop.top.SweatShirt;
import com.solvd.onlineShop.top.Shirt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.solvd.onlineShop.bottom.Bottom.getBottom;
import static com.solvd.onlineShop.headWear.HeadWear.getHeadWear;
import static com.solvd.onlineShop.top.Top.getTop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class ShopUtils {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    private static final List<String> colors = new ArrayList<>(Arrays.asList("Blue", "Yellow", "Green", "Orange", "Brown", "Purple", "Red", "Black", "White", "Turquoise"));
    private static final List<String> ShirtTypes = new ArrayList<>(Arrays.asList("TShirt", "Sleeveless", "Polo"));
    private static final List<String> sweatshirtTypes = new ArrayList<>(Arrays.asList("Sweater", "Hoodie", "LongSleeve", "Flannel", "Jacket"));
    private static final List<String> shortsTypes = new ArrayList<>(Arrays.asList("Jean", "Cargo", "Swimming", "Running", "Khaki"));
    private static final List<String> pantsTypes = new ArrayList<>(Arrays.asList("Jean", "Cargo", "Hiking", "Khaki", "Dress"));
    private static final List<String> hatTypes = new ArrayList<>(Arrays.asList("BaseBall", "Fedora", "Beenie", "Cowboy"));
    private static final List<String> sunglassesTypes = new ArrayList<>(Arrays.asList("Aviator", "Round", "PitViper", "Sport"));
    private static final List<String> humanNames = new ArrayList<>(Arrays.asList("Bob", "Brenda", "Barry", "Billy", "Bobbert"));
    private static List<Product> allProducts = new ArrayList<>();
    private static List<Product> generatedWishList = new ArrayList<>();

    public ShopUtils() {
    }

    ;

    public List<String> getColors() {
        return colors;
    }

    ;

    public List<String> getShirtTypes() {
        return ShirtTypes;
    }

    ;

    public List<String> gettSweatshirtTypes() {
        return sweatshirtTypes;
    }

    ;

    public List<String> getShortsTypes() {
        return shortsTypes;
    }

    public List<String> getPantsTypes() {
        return pantsTypes;
    }

    public List<String> getHatTypes() {
        return hatTypes;
    }

    public List<String> getSunglassesTypes() {
        return sunglassesTypes;
    }

    public static List<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public static List<Product> getGeneratedWishList() {
        return generatedWishList;
    }

    public static void setGeneratedWishList(List<Product> generatedWishList) {
        ShopUtils.generatedWishList = generatedWishList;
    }

    public static List<String> getHumanNames() {
        return humanNames;
    }

    ;

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    ;

    public static String randomColor() {
        return colors.get(getRandomNumber(0, colors.size()));
    }

    ;

    public static String randomHumanName() {
        return humanNames.get(getRandomNumber(0, humanNames.size()));
    }

    public static String randomProductName(String productType) {
        return randomColor() + " " + productType;
    }

    public static String randomProductType(List<String> products) {
        return products.get(getRandomNumber(0, products.size()));
    }

    public static int randomSKU() {
        return getRandomNumber(11111, 11122);
    }

    ;

    public static double randomPrice() {
        double price = getRandomNumber(10, 50);
        return price + 0.99;
    }

    ;

    public static Sizes randomSize() {
        return Sizes.values()[new Random().nextInt(Sizes.values().length)];
    }

    ;

    public static EnumCoupon randomCoupon() {
        return EnumCoupon.values()[new Random().nextInt(EnumCoupon.values().length)];
    }

    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static synchronized List<ClothingProduct> generateTops(int amount) {
        List<ClothingProduct> tops = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            if (randomBoolean()) {
                Shirt shirt = new Shirt(randomProductName(randomProductType(ShirtTypes)), randomSKU(), randomPrice(), getTop(), randomSize(), randomColor(), randomProductType(ShirtTypes), randomBoolean());
                tops.add(shirt);
            } else {
                SweatShirt sweatShirt = new SweatShirt(randomProductName(randomProductType(sweatshirtTypes)), randomSKU(), randomPrice(), getTop(), randomSize(), randomColor(), randomProductType(ShirtTypes), randomBoolean());
                tops.add(sweatShirt);
            }
        }
        return tops;
    }

    public static synchronized List<ClothingProduct> generateBottoms(int amount) {
        List<ClothingProduct> bottoms = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            if (randomBoolean()) {
                Shorts shorts = new Shorts(randomProductName(randomProductType(shortsTypes)), randomSKU(), randomPrice(), getBottom(), randomSize(), randomColor(), randomProductType(shortsTypes), randomBoolean());
                if (shorts.getType() == "Swimming") {
                    shorts.setForSwimming(true);
                }
                bottoms.add(shorts);
            } else {
                Pants pants = new Pants(randomProductName(randomProductType(pantsTypes)), randomSKU(), randomPrice(), getBottom(), randomSize(), randomColor(), randomProductType(pantsTypes), randomBoolean());
                bottoms.add(pants);
            }
        }
        return bottoms;
    }

    ;

    public static synchronized List<ClothingProduct> generateHeadWear(int amount) {
        List<ClothingProduct> headWear = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            if (randomBoolean()) {
                Hat hat = new Hat(randomProductName(randomProductType(hatTypes)), randomSKU(), randomPrice(), getHeadWear(), randomSize(), randomColor(), randomProductType(hatTypes), randomBoolean());
                headWear.add(hat);
            } else {
                Sunglasses sunglasses = new Sunglasses(randomProductName(randomProductType(sunglassesTypes)), randomSKU(), randomPrice(), getHeadWear(), randomSize(), randomColor(), randomProductType(sunglassesTypes), randomBoolean());
                headWear.add(sunglasses);
            }
        }
        return headWear;
    }

    public static synchronized List<Product> generateShop() {
        TopRunnable topRunnable = new TopRunnable();
        BottomRunnable bottomRunnable = new BottomRunnable();
        HeadWearRunnable headWearRunnable = new HeadWearRunnable();
        OrderRunnable orderRunnable = new OrderRunnable();
        CompletableFuture.runAsync(topRunnable);
        CompletableFuture.runAsync(bottomRunnable);
        CompletableFuture.runAsync(headWearRunnable);
        CompletableFuture.runAsync(orderRunnable);
        return allProducts;
    }
}

