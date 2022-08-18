package com.solvd.onlineShop;

public abstract class Product {
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

    public void checkProduct(Product product){
        if(product == null){
            throw new ProductsException("Invalid Product");
        }
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price + "$";
    }

}
