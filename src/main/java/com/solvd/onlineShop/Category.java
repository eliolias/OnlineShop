package com.solvd.onlineShop;

import com.solvd.onlineShop.enums.Seasons;
import com.solvd.onlineShop.exceptions.CategoriesException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public abstract class Category {

    private final static Logger LOGGER = LogManager.getLogger(Category.class);

    private String name;
    private List<Product> products;
    private Seasons currentSeason;


    public Category(String name, List<Product> products, Seasons currentSeason) {
        this.name = name;
        this.products = products;
        this.currentSeason = currentSeason;
    }

    public Category(String name, Seasons currentSeason) {
        this.name = name;
        this.currentSeason = currentSeason;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Seasons getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Seasons currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> productList) {
        products.addAll(productList);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeProducts(List<Product> productList) {
        products.removeAll(productList);
    }

    public void checkCategories(List<Clothing> categories) {
        if (categories == null || categories.isEmpty()) {
            throw new CategoriesException("Empty list of categories. Invalid");
        }
        LOGGER.info("Valid list of categories");
    }


    @Override
    public String toString() {
        return this.name;
    }
}
