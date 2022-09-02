package com.solvd.onlineShop;

import com.solvd.onlineShop.exceptions.ProductsException;
import com.solvd.onlineShop.interfaces.Returnable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Product {

    private final static Logger LOGGER = LogManager.getLogger(ClothingProduct.class);
    private String name;
    private int sku;
    private double price;
    private Category category;

    public Product(String name, int sku, double price, Category category) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.category = category;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public boolean checkProduct(Product product){
        if(product == null){
            throw new ProductsException("Invalid Product");
        } else {
            return true;
        }
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public Returnable<Product> returnItem = ((Product product) -> {
        if (product.getCategory().getName().equals("Tops") || product.getCategory().getName().equals("Bottoms") || product.getCategory().getName().equals("HeadWear")) {
            LOGGER.info(product.getName() + "Product returnable");
        }
    });

}
