package com.solvd.onlineShop.headWear;

import com.solvd.onlineShop.Category;
import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.Warrantable;
import com.solvd.onlineShop.Product;

public class Sunglasses extends ClothingProduct implements Warrantable {

    private Boolean isPolarized;

    public Sunglasses(String name, int sku, double price, Category category, String size, String color, String type, Boolean isPolarized) {
        super(name, sku, price, category, size, color, type);

        this.isPolarized = isPolarized;
    }

    public Sunglasses() {
    }

    public Boolean getPolarized() {
        return isPolarized;
    }

    public void setPolarized(Boolean polarized) {
        isPolarized = polarized;
    }

    @Override
    public double warrantyPrice() {
        double price = warrantyPrice * this.getPrice();
        return price;
    }

    public void addWarranty(){
        System.out.println("Sunglasses Warranty purchased for: " + warrantyPrice());
        this.setPrice(this.getPrice() + warrantyPrice());
    }

    @Override
    public String warrantyPolicy() {
        System.out.println("Warranty on sunglasses covers scratches, breaks, and loss of sunglasses as long as un-intentional.");
        return null;
    }
}
