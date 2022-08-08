package Shop;

import java.util.ArrayList;

public class Category {
    private ArrayList<Product> products = new ArrayList<Product>();
    private String name;

    public Category(String name){
        this.name = name;
    }

    public Category(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public ArrayList<String> getAllProductNames(){
        ArrayList<String> productNames = new ArrayList<String>();
        for(Product product: products){
            productNames.add(product.getName());
        }
        return productNames;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void addProducts(ArrayList<Product> productList){
        products.addAll(productList);
    }

}
