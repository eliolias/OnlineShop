package Shop;

import java.util.*;

public abstract class Category {

    private String name;
    private List<Product> products;
    private String currentSeason;


    public Category(String name, List<Product> products, String currentSeason) {
        this.name = name;
        this.products = products;
        this.currentSeason = currentSeason;
    }

    public Category(String name, String currentSeason) {
        this.name = name;
        this.currentSeason = currentSeason;
    }

    public Category(String name){
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

    public String getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(String currentSeason) {
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

    @Override
    public String toString() {
        return this.name;
    }
}
