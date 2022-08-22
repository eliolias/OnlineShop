package com.solvd.onlineShop;

import com.solvd.onlineShop.exceptions.CategoriesException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Shop {

    private final static Logger LOGGER = LogManager.getLogger(Shop.class);

    private String name;
    private Set<Category> categories = new HashSet<Category>();
    private int inventory = 100;

    public Shop(String name) {
        this.name = name;

    }

    public Shop() {

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
        if(categories.isEmpty()){
            throw new CategoriesException("Empty list of categories. Invalid");
        }
        LOGGER.info("Valid list of categories");
    }
}

