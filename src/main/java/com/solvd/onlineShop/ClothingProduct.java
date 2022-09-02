package com.solvd.onlineShop;

import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.interfaces.Returnable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClothingProduct extends Product{

    private Sizes size;
    private String color;
    private String type;

    public ClothingProduct(String name, int sku, double price, Category category, Sizes size, String color, String type){
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.type = type;

    }

    public ClothingProduct(){

    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getClass().getSimpleName() + " - " + this.getPrice() + "$";
    }
}
