package Shop.HeadWear;

import Shop.Category;
import Shop.Product;
import Shop.Warranty;

public class Sunglasses extends Product implements Warranty {

    private String size;
    private String color;
    private String type;
    private Boolean isPolarized;

    public Sunglasses(String name, int sku, double price, Category category, String size, String color, String type, Boolean isPolarized) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.type = type;
        this.isPolarized = isPolarized;
    }

    public Sunglasses() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
