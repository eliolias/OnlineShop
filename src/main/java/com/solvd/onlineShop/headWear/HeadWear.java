package com.solvd.onlineShop.headWear;

import com.solvd.onlineShop.Clothing;
import com.solvd.onlineShop.Product;

import java.util.*;

public class HeadWear extends Clothing {

    private List<String> headWearTypes = new ArrayList<>();

    public HeadWear(String name, List<Product> products, List<String> headWearTypes) {
        super(name, products);
        this.headWearTypes = headWearTypes;
    }


    public HeadWear(String name, List<Product> products) {
        super(name, products);
    }

    public HeadWear(String name) {
        super(name);
    }

    public HeadWear() {
    }

    public List<String> getHeadWearTypes() {
        return headWearTypes;
    }

    public void setHeadWearTypes(List<String> headWearTypes) {
        this.headWearTypes = headWearTypes;
    }
}