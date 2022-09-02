package com.solvd.onlineShop.human;

import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public abstract class Human{
    private final static Logger LOGGER = LogManager.getLogger(Customer.class);

    private List<Product> wishList;

    private String name;
    private boolean isEmployee;

    private int shopperPoints;


    public Human(String name, boolean isEmployee, int shopperPoints) {
        this.name = name;
        this.isEmployee = isEmployee;
        this.shopperPoints = shopperPoints;
    }

    public Human(String name, boolean isEmployee) {
        this.name = name;
        this.isEmployee = isEmployee;

    }

    public Human(String name) {
        this.name = name;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public List<Product> getWishList() {
        return wishList;
    }

    public void setWishList(List<Product> wishList) {
        this.wishList = wishList;
    }

    public int getShopperPoints() {
        return shopperPoints;
    }

    public void setShopperPoints(int frequentShopper) {
        this.shopperPoints = frequentShopper;
    }

    public List<String> getWishListNames() {
        List<String> names = new ArrayList<>();
        for (Product product : wishList) {
            names.add(product.getName());
        }
        return names;
    }


}
