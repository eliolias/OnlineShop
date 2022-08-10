package Shop;

import java.util.*;

public class Category {
    private List<Product> products = new ArrayList<>();
    private String name;

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

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
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
