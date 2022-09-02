package com.solvd.onlineShop;

import com.solvd.onlineShop.exceptions.CategoriesException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static com.solvd.onlineShop.bottom.Bottom.getBottom;
import static com.solvd.onlineShop.headWear.HeadWear.getHeadWear;
import static com.solvd.onlineShop.top.Top.getTop;

public class Shop {

    private final static Logger LOGGER = LogManager.getLogger(Shop.class);

    private static Shop shop = new Shop("Online Shop");
    private static List<Clothing> clothingCategories = new ArrayList<>(Arrays.asList(getTop(), getBottom(), getHeadWear()));
    private String name;
    private Set<Category> categories = new HashSet<Category>();
    private int inventory = 100;

    public Shop(String name) {
        this.name = name;

    }

    public Shop() {

    }

    public static List<Clothing> getClothingCategories() {
        return clothingCategories;
    }

    public static void setClothingCategories(List<Clothing> clothingCategories) {
        Shop.clothingCategories = clothingCategories;
    }

    public static Shop getShop() {
        return shop;
    }

    public static void setShop(Shop shop) {
        Shop.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public void addCategories(List<Category> newCategories) {
        categories.addAll(newCategories);
    }

    public void removeCategories(List<Category> categoriesToRemove) {
        categories.removeAll(categoriesToRemove);
    }

    public void checkCategories(List<Clothing> categories) throws CategoriesException {
        if (categories.isEmpty()) {
            throw new CategoriesException("Empty list of categories. Invalid");
        }
        LOGGER.info("Valid list of categories");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return categories.equals(shop.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories);
    }
}

