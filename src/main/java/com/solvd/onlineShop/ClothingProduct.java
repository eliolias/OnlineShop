package com.solvd.onlineShop;

import com.solvd.onlineShop.enums.Sizes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClothingProduct extends Product{

    private final static Logger LOGGER = LogManager.getLogger(ClothingProduct.class);

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

    public void returnItem(Product product) {
        if (product.getCategory().getName().equals("Tops") || product.getCategory().getName().equals("Bottoms") || product.getCategory().getName().equals("HeadWear")) {
        LOGGER.info("Product returnable");
        }
    }
}
